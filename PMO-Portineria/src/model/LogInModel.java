package model;

import java.sql.*;

public class LogInModel {
	
	Connection conection;
	
	public LogInModel () {
		conection = SqliteConnection.Connector();
		if (conection == null) {
			System.out.println("connection not successful");
			System.exit(1);
		}
	}
  
	public boolean isDbConnected() {
		try {
			return !conection.isClosed();
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean canLogIn(String user, String pass) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean canLog = false;
		String comand = "select * from Registro where Username = ? and Password = ?";
		
		try {
			ps = conection.prepareStatement(comand);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			if (rs.next()) 
				canLog = true;
			
		} catch (Exception e) {
			System.out.println(e);
		} /* finally {
			ps.close();
			rs.close();
		} */
		
		return canLog;
		
	}
}