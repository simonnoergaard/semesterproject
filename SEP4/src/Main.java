public class Main {

	public static void main(String[] args) {
		JDBCConnector connection = new JDBCConnector();
		connection.connect(5432,"dawojpvu", "8EDrrPQHm-LXcJQZ6AtvYwZbam2TwubZ");
		
		//MeasurementDataGenerator generator = new MeasurementDataGenerator(connection);
		// Activate the generator to create more measurements
		//generator.start();
		
		//ApplicationGUI gui = new ApplicationGUI(connection);

	}
}
