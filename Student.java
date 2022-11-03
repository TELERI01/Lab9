package Lab9;

public class Student {
	
	private String name;
	private int age;
	private String major;
	private String hobby;
	private double expected_gpa;
	private int time_learning_java;
	
	Student(String name, int age, String major, String hobby, double expected_gpa, int time_learning_java ){
		this.name=name;
		this.age=age;
		this.major=major;
		this.hobby=hobby;
		this.expected_gpa=expected_gpa;
		this.time_learning_java=time_learning_java;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getMajor() {
		return major;
	}
	public String getHobby() {
		return hobby;
	}
	public double getGPA() {
		return expected_gpa;
	}
	public int getJava() {
		return time_learning_java;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	public void setJava(int time_learning_java) {
		this.time_learning_java=time_learning_java;
	}
	
	
	public static void main(String[] args) {
		Student myfirstStudent = new Student("Tyler",19 ,"CS" ,"Video Game Developement" , 3.9, 12);
		
		System.out.println("Student Info:\nName: "+ myfirstStudent.name+ "\nAge: " + myfirstStudent.age + "\nMajor: "+ 
		myfirstStudent.major+ "\nHobby: " + myfirstStudent.hobby+ "\nJava: " + myfirstStudent.time_learning_java);
		
		myfirstStudent.setName("Gibbie");
		System.out.println("Name: " + myfirstStudent.getName());
		
		
		
		
	}

}
