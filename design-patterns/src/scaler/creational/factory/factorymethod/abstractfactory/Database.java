package scaler.creational.factory.factorymethod.abstractfactory;


public class Database {
	private DatabasePlatforms platform;
	public static enum DatabasePlatforms {
		SqlDatabase,
		DynamoDatabase
	}
	
	public Database(DatabasePlatforms platform) {
		this.platform = platform;
	}
	public void checkDbHealth() {
		
	}; // normal method
	public void getCachedConnectionPool() {
		
		
	}; // normal method
	
	
//	public Query getQuery(); // factory method
//	public Transaction getTransaction(); // factory method
	// when there are multiple factory method in the same class, we make the factory abstract, 
	// by moving these methods to factory class
	public DatabaseFactory createDatabase() {
		
		return PracticalDatabaseFactory.createDatabaseFactory(platform);
	}
}
