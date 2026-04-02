package lab5.api;

import java.util.Arrays;
import java.util.Set;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


/**
 * Represents a user in the system.
 */
@Entity
public class User {
	@Id
    private String name;
    private String pwd;
    private String domain;
	@Column(length = 255)
    private String displayName;
	@Lob
    @Basic(fetch = FetchType.EAGER)
	private byte[] photo;
    @ElementCollection( fetch = FetchType.EAGER )
    private Set<String> phoneNumbers;


    public User() {
        this.pwd = null;
        this.name = null;
        this.domain = null;
        this.displayName = null;
        this.photo = null;
    }

    public User(String name, String pwd, String displayName, String domain, byte[] photo, Set<String> phoneNumbers) {
        this.pwd = pwd;
        this.name = name;
        this.domain = domain;
        this.displayName = displayName;
        this.photo = photo;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", displayName='" + displayName + '\'' +
                ", domain='" + domain + '\'' +
                ", photo=" + (photo != null ? photo.length + " bytes" : "null") +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.length);
		result = prime * result + ((phoneNumbers == null) ? 0 : phoneNumbers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (other.photo == null)
			return false; 
		else if (photo.length != other.photo.length)
			return false;
		else 
			return Arrays.equals(photo, other.photo);; // We consider photos with the same size as equal (we do not want to compare the content of the photos)
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		return true;
	}
}
