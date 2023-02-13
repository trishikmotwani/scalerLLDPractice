package scaler.creational.factory.factorymethod;

// concrete creator classA
public class DynamoDatabase extends Database {

	@Override
	public Query createQuery() {
		// TODO Auto-generated method stub
		return new DynamoQuery();
	}

	public void createStatement() {
		// TODO Auto-generated method stub
		
	}

}
