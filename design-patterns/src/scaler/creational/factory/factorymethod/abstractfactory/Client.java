package scaler.creational.factory.factorymethod.abstractfactory;

import scaler.creational.factory.factorymethod.abstractfactory.Database.DatabasePlatforms;
import scaler.creational.factory.factorymethod.abstractfactory.model.Query;

public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database db = new Database(DatabasePlatforms.SqlDatabase);
		DatabaseFactory dbFactory = db.createDatabase();
		Query q = dbFactory.getQuery();
		q.getInsertQuery();
	}

}
