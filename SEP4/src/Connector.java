import java.sql.*;
import java.util.ArrayList;
//This class handles all interaction with the database
public class Connector {
	
	private Connection connection;
	
	public void connect(int portNo, String userName, String password) {
		// Establishing a PostgreSQL database connection
		String databaseUrl = "jdbc:postgresql://localhost:" + 5432 + "/dawojpvu";

		try {
			connection = DriverManager.getConnection(databaseUrl, "dawojpvu", "8EDrrPQHm-LXcJQZ6AtvYwZbam2TwubZ");
			System.out.println("Connection established to: Solarpanel" + databaseUrl);
		} 
		catch (Exception exception) {
			System.out.println("Connection failed");
			exception.printStackTrace();
		}
	}
	

}
