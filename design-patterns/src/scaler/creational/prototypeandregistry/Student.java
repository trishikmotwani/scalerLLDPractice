package scaler.creational.prototypeandregistry;

public class Student implements Prototype<Student> {

	private String name;
	private int age;
	private String university;
	private String batch;
	private double averageBatchPsp;
	
	
	public Student() {
		
	}
	// if I only use copy constructor, then problem is that it will be tightly coupled,
	// eg: Student stud= new STudent(new STudent()), Student stud = new IntelligentStudent(new IntelligentStudent())
	// making this private such that no client can use copy construtor to create clone
	public Student(Student stud) {
		this.name = stud.name;
		this.age = stud.age;
		this.university = stud.university;
		this.batch = stud.batch;
		this.averageBatchPsp = stud.averageBatchPsp;
	}
	// with the help of clone method, we remove the dependency on concrete objects , to avoid OCP, open close principle
	public Student clone() {
		Student student = new Student(this);
//		student.age = this.age;
//		student.averageBatchPsp = this.averageBatchPsp;
//		student.name = this.name;
//		student.university = this.university;
//		student.batch = this.batch;
		return student;
	}
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getAge() {
//		return age;
//	}
	public void setAge(int age) {
		this.age = age;
	}
//	public String getUniversity() {
//		return university;
//	}
	public void setUniversity(String university) {
		this.university = university;
	}
//	public String getBatch() {
//		return batch;
//	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
//	public double getAverageBatchPsp() {
//		return averageBatchPsp;
//	}
	public void setAverageBatchPsp(double averageBatchPsp) {
		this.averageBatchPsp = averageBatchPsp;
	}
}
