package scaler.creational.prototypeandregistry;

import java.util.HashMap;

public class StudentRegister {

	HashMap<String, Student> studenetPrototypesRegister = new HashMap<String, Student>();
	
	public void register(String prototypeKey, Student stud) {
		studenetPrototypesRegister.put(prototypeKey, stud);
	}
	
	public Student getStudentPrototype(String prototypeKey) {
		return studenetPrototypesRegister.get(prototypeKey);
	}
}
