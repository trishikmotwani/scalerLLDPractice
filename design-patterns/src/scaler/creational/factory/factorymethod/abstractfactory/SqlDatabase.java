package scaler.creational.factory.factorymethod.abstractfactory;

import scaler.creational.factory.factorymethod.abstractfactory.model.Query;
import scaler.creational.factory.factorymethod.abstractfactory.model.SQLQuery;
import scaler.creational.factory.factorymethod.abstractfactory.model.SQLTransaction;
import scaler.creational.factory.factorymethod.abstractfactory.model.Transaction;

public class SqlDatabase implements DatabaseFactory {

	@Override
	public Query getQuery() {
		// TODO Auto-generated method stub
		return new SQLQuery();
	}

	@Override
	public Transaction getTransaction() {
		// TODO Auto-generated method stub
		return new SQLTransaction();
	}

}
