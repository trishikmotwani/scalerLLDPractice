package scaler.creational.factory.factorymethod.abstractfactory;

import scaler.creational.factory.factorymethod.abstractfactory.Database.DatabasePlatforms;

public class PracticalDatabaseFactory {

	public static DatabaseFactory createDatabaseFactory(DatabasePlatforms platform) {
		switch(platform) {
			case SqlDatabase: {
				return new SqlDatabase();
			}
			case DynamoDatabase: {
				return new DynamoDatabase();
			}
			default: {
				return new SqlDatabase();
			}
		}
	}
}
