package model;

/*
 * interfaccia per identificare un dipendente e le relative credenziali
 */

public interface employee {
	
	public String getName();
	
	public String getSurname();

	public boolean checkCredentials(String username, String password);

}
