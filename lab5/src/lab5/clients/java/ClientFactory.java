package lab5.clients.java;

public interface ClientFactory<T> {

	public T get(String domain) ;
}
