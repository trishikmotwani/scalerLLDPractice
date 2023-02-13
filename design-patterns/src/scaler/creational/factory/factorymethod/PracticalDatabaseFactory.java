package scaler.creational.factory.factorymethod;

import scaler.creational.factory.factorymethod.Database.DatabasePlatforms;

public class PracticalDatabaseFactory {

	public static Database getDatabase(DatabasePlatforms platform) {
		switch(platform) {
		 case SqlDatabase : 
			 return new SqlDatabase();
		 
		 case DynamoDatabase: 
			 return new DynamoDatabase();
			 
		 default: 
			 return new SqlDatabase();
		
		}
	}
}
