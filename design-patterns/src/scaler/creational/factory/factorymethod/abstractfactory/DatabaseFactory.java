package scaler.creational.factory.factorymethod.abstractfactory;

import scaler.creational.factory.factorymethod.abstractfactory.model.Query;
import scaler.creational.factory.factorymethod.abstractfactory.model.Transaction;

public interface DatabaseFactory {

	
	public Query getQuery(); // factory method
	public Transaction getTransaction(); // factory method
	
}
