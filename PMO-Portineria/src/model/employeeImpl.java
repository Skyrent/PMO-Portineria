package model;

public class employeeImpl implements employee {

	private String name;
	private String surname;
	private String username;
	private String password;
	
	public employeeImpl(String name, String surname, String password) {
		this.name = name;
		this.surname = surname;
		this.username = surname + "." + name;
		this.password = password;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getSurname() {
		return this.surname;
	}

	@Override
	public boolean checkCredentials(String username, String password) {
		return this.username.equals(username) && this.password.equals(password); 
	}

}
 