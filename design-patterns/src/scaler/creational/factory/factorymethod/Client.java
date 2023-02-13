package scaler.creational.factory.factorymethod;

import scaler.creational.factory.factorymethod.Database.DatabasePlatforms;

public class Client {
	static Database db;
//	public static void databaseFactory(DatabasePlatforms platform) {
//		switch(platform) {
//		 case SqlDatabase : 
//			 db = new SqlDatabase();
//			 break;
//		 
//		 case DynamoDatabase: 
//			 db = new DynamoDatabase();
//			 break;
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		db = PracticalDatabaseFactory.getDatabase(DatabasePlatforms.SqlDatabase);
		db.insertItem();
	}

}
