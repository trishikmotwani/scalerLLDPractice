package scaler.creational.prototypeandregistry;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create student prototype - what is a prototype ??
		// a base object upon which new features can be added - just like a template
		
		// first fill the register with prototypes
		StudentRegister register = new StudentRegister();
		Student studPrototype1 = new Student();
		studPrototype1.setAverageBatchPsp(89);studPrototype1.setBatch("Nov21");
		register.register("Nov21", studPrototype1);
		
		IntelligentStudent istudPrototype1 = new IntelligentStudent();
		studPrototype1.setAverageBatchPsp(89);studPrototype1.setBatch("INov21");istudPrototype1.setAverageIq(81);
		register.register("INov21", istudPrototype1);
		
		
		
		// now create clones from prototypes and add your changes
		Student nov21StudentPrototype = register.getStudentPrototype("Nov21"); // OR new Student();
		Student trishik = nov21StudentPrototype.clone();
		trishik.setName("Trishik");trishik.setAge(20);
		
		
		Student nov21IntelligentStudentprototype = register.getStudentPrototype("INov21"); // OR new Intelligent Student();
		Student chandni = nov21IntelligentStudentprototype.clone();
		chandni.setName("Chandni");chandni.setAge(19);
	}

}
