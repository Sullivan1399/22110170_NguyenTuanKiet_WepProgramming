package pratice.models;

import java.io.Serializable;

public class usermodels {
	private int id;
	private String username;
    private String password;
	private String email;
	private String fullname;
	private String image;

	public usermodels() {
		super();
	}

	public usermodels(String username, String password, String email, String fullname, String image) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
        this.image = image;
    }
	
	public usermodels(int id, String username, String password, String email, String fullname, String image) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fullname = fullname;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
        return password;
    }
	
    public void setPassword(String password) {
        this.password = password;
    }
    
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", username=" + username + ", password='" + password + ", email=" + email + ", fullname=" + fullname
				+ ", image=" + image + "]";
	}

}
