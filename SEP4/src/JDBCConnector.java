import java.sql.*;
import java.util.ArrayList;
//This class handles all interaction with the database
public class JDBCConnector {
	
	private Connection connection;
	
	public void connect(int portNo, String userName, String password) {
		// Establishing a PostgreSQL database connection
		String databaseUrl = "jdbc:postgresql://balarama.db.elephantsql.com:" + portNo + "/" + userName;

		try {
			connection = DriverManager.getConnection(databaseUrl, userName, password);
			//System.out.println("Connection established to: " + databaseUrl);
		} 
		catch (Exception exception) {
			System.out.println("Connection failed");
			exception.printStackTrace();
		}
	}
	

	public ArrayList<Thermal> retrieveAmbientAirTemperature(float ambientAirTemperature) {
		ArrayList<Thermal> result = new ArrayList<Thermal>();
		
		String sql = "SELECT * FROM Solarpanel.Thermal WHERE ambientAirTemperature> " + ambientAirTemperature + ";";

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql); // use the executeQuery() function when a result is expected
			
			while (resultSet.next()) { // Goes to the next row of data if available
				Thermal thermal= new Thermal(resultSet.getDate(1), resultSet.getTime(2),
						resultSet.getFloat(3), resultSet.getFloat(4),
						resultSet.getFloat(5), resultSet.getFloat(6), 
						resultSet.getFloat(7),resultSet.getFloat(8),
						resultSet.getInt(9),resultSet.getFloat(10),
						resultSet.getFloat(11), resultSet.getFloat(12),resultSet.getFloat(13));
				result.add(thermal);
			}
			//System.out.println("Selection of speeding violations above " + speedLimit + " successful");
		} catch (SQLException exception) {
			System.out.println("Selection of speeding violations failed");
			exception.printStackTrace();
		}
		
		return result;
	}
	
	public void close() {
		// Close the connection
		try {
			connection.close();
			System.out.println("Connection closed");
		} catch (SQLException exception) {
			System.out.println("Connection closing failed");
			exception.printStackTrace();
		}
	}

	// Utility method to convert from one date/time format to another
    private java.sql.Timestamp convertToSqlTimestamp(java.util.Date uDate) {
        java.sql.Timestamp timestamp = new java.sql.Timestamp(uDate.getTime());
        return timestamp;
    }
}
