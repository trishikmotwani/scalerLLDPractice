package scaler.creational.prototypeandregistry;

public class IntelligentStudent extends Student {

	int averageIq;
	
	public IntelligentStudent() {
	}
	
	// if I only use copy constructor, then problem is that it will be tightly coupled,
	// eg: Student stud= new STudent(new STudent()), Student stud = new IntelligentStudent(new IntelligentStudent())
	public IntelligentStudent(IntelligentStudent stud) {
		super(stud);
		this.averageIq = stud.averageIq;
	}
	// with the help of clone method, we remove the dependency on concrete objects , to avoid OCP, open close principle
	public IntelligentStudent clone() {
//		IntelligentStudent istudent = new IntelligentStudent(this);
//		istudent.iq = this.iq;
//		istudent.setAge(this.getAge());
//		istudent.setAverageBatchPsp(this.getAverageBatchPsp());
//		istudent.setBatch(this.getBatch());
		return new IntelligentStudent(this);
	}

	public int getAverageIq() {
		return averageIq;
	}

	public void setAverageIq(int averageIq) {
		this.averageIq = averageIq;
	}
	
}
