package ua.lviv.lgs;

public abstract class Plane{
	
	protected double length;
	protected double width;
	protected double weight;
	
	public Plane(double length, double width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	abstract void startEngine();
		
	abstract void flyingPlane();
	
	void landingPlane() {
		System.out.println("the fly is coming into the landing");
	}
	
	
}
