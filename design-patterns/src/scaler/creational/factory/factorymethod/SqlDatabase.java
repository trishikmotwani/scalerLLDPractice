package scaler.creational.factory.factorymethod;

//concrete creator classB
public class SqlDatabase extends Database {

	@Override
	public Query createQuery() {
		// TODO Auto-generated method stub
		return new SQLQuery();
	}

	public void createStatement() {
		// TODO Auto-generated method stub
		
	}

}
