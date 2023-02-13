package scaler.creational.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseConnection {
	private static DatabaseConnection databaseConn;
	// private static DatabaseConnection databaseConn = new DatabaseConnection(url, port, arrsylist);  // eager / early instantiation
		// disadvantage of eager initialization is we cannot have parameters passed early , only objects that want the connection will give it
	private final String url;
	private final int port;
	private final ArrayList<Integer> al;
	
	private DatabaseConnection(String url, int port, ArrayList<Integer> al) {
		this.url = url;
		this.port = port;
		this.al = al;
	}
	
	public static DatabaseConnection getDatabaseConnection() {
		// but if we make function synchronized and 1000's of objects want the connection at the same time,
		// then it will be inefficient, so we will apply lock only on the critical section
		//synchronized(DatabaseConnection.class) { 
		// if i keep synchronized above , everytime request will come and go inside synchronized block and that will hamper performance
			
		if(databaseConn == null) { // if 2 threads hit this statement at the same time bith can go inside and create 2 objects one by one getting into synchronized block
				
				synchronized(DatabaseConnection.class) { // if i keep here then for many req's if conn is not null , obj will be returned directly
					
					if(databaseConn == null) { // double check locking can avoid 
						ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2));
						databaseConn = new DatabaseConnection("dburl", 8089, al);
					}
				}
			}
		//}
		
		return databaseConn;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return the al
	 */
	public ArrayList<Integer> getAl() {
		return (ArrayList<Integer>) al.clone();
	}
	
}
