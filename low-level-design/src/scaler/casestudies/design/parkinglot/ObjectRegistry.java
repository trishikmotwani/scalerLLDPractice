package scaler.casestudies.design.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ObjectRegistry {

	private static Map<String, Object> container = new HashMap<String, Object>();
	
	public static Object get(String objectKey) {
		return container.get(objectKey);
	}
	
	public static void register(String objectKey, Object obj) {
		container.put(objectKey, obj);
	}
	
	public static void unregister(String objectKey) {
		container.remove(objectKey);
	}
}
