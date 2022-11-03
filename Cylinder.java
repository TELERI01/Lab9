package Lab9;

public class Cylinder {
	private double radius;
	private double height;
	
	//Constructors
	
	Cylinder(double radius, double height){
		this.radius=radius;
		this.height=height;
	}
	public double getRadius(){
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double Area() {
		double area = radius*height;
		return area;
	}
	public double Peri() {
		double peri = ((2*radius)*2) + (2*height);
		return peri;
	}
	
	public static void main(String[] args) {
		Cylinder one = new Cylinder(12,13);
		
		System.out.println(one.Area());
		System.out.println(one.Peri());
		
		one.setHeight(14);
		System.out.println(one.Area()+ "\n" + one.Peri());

	}

}
