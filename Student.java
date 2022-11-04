package Lab9;

public class Student {
	
	private String name;
	private int age;
	private String major;
	private String hobby;
	private double expected_gpa;
	private int time_learning_java;
	
	public Student() {
		this.name="";
		this.expected_gpa=0;
		this.time_learning_java=0;
	}
	
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
	public void setGPA(double expected_gpa) {
		this.expected_gpa=expected_gpa;
	}
	
	
	public String HonorsEligible() {
		String Honors;
		if(expected_gpa>=3.5) {
			Honors="true";
		}
		else {
			Honors="false";
		}
		return Honors;
	}
	
	public static void main(String[] args) {
		Student myfirstStudent = new Student("Tyler",19 ,"CS" ,"Video Game Developement" , 3.9 , 12);
		
		System.out.println("Student Info:\nName: "+ myfirstStudent.name+ "\nAge: " + myfirstStudent.age + "\nMajor: "+ 
		myfirstStudent.major+ "\nHobby: " + myfirstStudent.hobby+ "\nJava: " + myfirstStudent.time_learning_java);
		
		System.out.println("Honors Eligible: " + myfirstStudent.HonorsEligible());
		
		myfirstStudent.setGPA(3.5);
		myfirstStudent.setName("Gibbie");
		System.out.println("Name: " + myfirstStudent.getName());
		System.out.println("Honors Eligible: " + myfirstStudent.HonorsEligible());
		
	}
	

}
