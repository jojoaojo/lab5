package lab5;

import java.io.File;
import java.sql.Connection;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lab5.api.User;

public class HibernateExample {

    private static final String HIBERNATE_CFG_FILE = "hibernate.cfg.xml";
	private static SessionFactory sessionFactory;


    public static void main(String[] args) {

        SessionFactory sessionFactory = null;
		try {
			sessionFactory = new Configuration()
                    .configure(new File(HIBERNATE_CFG_FILE))
                    .buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
            throw e;
        }

        User user = new User();
        user.setName("john.doe");
        user.setDisplayName("John Doe");
        user.setDomain("fct");
        user.setPwd("pwd");
        user.setPhoneNumbers(Set.of("999999999"));

        Set<User> users = Set.of(user);

		try(var session = sessionFactory.openSession()) {
		     var tx = session.beginTransaction();
		     try {
		    	 for( var o : users )
		    		 session.persist(o);
		    	 tx.commit();
		     } catch (Exception e) {
		    	 if (tx.getStatus().canRollback()) tx.rollback();
		    	 throw e;
		     }
		}

        String name = "john.doe";
        String phoneNumber = "888888888";
		try(var session = sessionFactory.openSession()) {
		     var tx = session.beginTransaction();
		     try {
                var u = session.get(User.class,name );
                if( ! u.getPhoneNumbers().contains(phoneNumber))
                    u.getPhoneNumbers().add(phoneNumber);
                session.persist(u);
                tx.commit();
		     } catch (Exception e) {
		    	 if (tx.getStatus().canRollback()) 
                    tx.rollback();
		    	 throw e;
		     }
		}

		try(var session = sessionFactory.openSession()) {
            session.doWork(connection -> 
                connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE));
		     var tx = session.beginTransaction();
		     try {
                var u = session.get(User.class,name );
                System.out.println( u);
                
                tx.commit();
		     } catch (Exception e) {
		    	 if (tx.getStatus().canRollback()) 
                    tx.rollback();
		    	 throw e;
		     }
		}

	}

}
