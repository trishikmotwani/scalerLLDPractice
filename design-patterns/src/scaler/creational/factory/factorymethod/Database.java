package scaler.creational.factory.factorymethod;

// abstract product creator class
abstract public class Database {
	public enum DatabasePlatforms {
		SqlDatabase,
		DynamoDatabase
	}
	public abstract Query createQuery(); // factory method as it requires different objects
	
	public void insertItem() { // normal method
		Query q = createQuery();
		q.insert();
		
	}
	public void checkDbHealth() {
		
	}
}
