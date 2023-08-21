package Methods;

public class Registration {
	
	private String name;
	public String lastname;
	public int age;
	private String username;
	private String password;
	
	
	public Registration(String name, String lastname, int age, String username, String password) {
		
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.username = username;
		this.password = password;
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
	
	
	
	
	
	
	

}
