package ua.lviv.lgs;

public class Cy_27 extends Plane implements Special{
	
	private double maxSpeed;
	private String color;
	ControlsPlane controlsPlane = new ControlsPlane();
	
	public Cy_27(double length, double width, double weight, double maxSpeed,String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void forsage() {
		System.out.println("Forsage speed is " + rnd(1.2 * maxSpeed,1.5 * maxSpeed) + " km/h");		
	}

	@Override
	public void stealth() {
		System.out.println("the plane will not be visible " + (int) rnd(30,600) + " sec");		
	}

	@Override
	public void nuclearStrike() {		
		System.out.println("the number of warheads dropped " + (int) rnd(1,10) + " piece");
	}
	
	void moveUp() {
		controlsPlane.moveUp();
	}
	
	void moveDown() {
		controlsPlane.moveDown();
	}
	
	void moveLeft() {
		controlsPlane.moveLeft();
	}
	
	void moveRight() {
		controlsPlane.moveRight();
	}

	void startEngine() {
		System.out.println("readiness for take-off " + (int) rnd(20,88) + " sec");
	}
		
	void flyingPlane() {
		System.out.println("take off, flight range " + rnd(0,1000) + " km");
	}
	
	public String getColor() {
		return color;
	}
	
	static double rnd(double range1,double  range2) {		
		double doble_rnd;
		doble_rnd = range1 + (range2 - range1) * Math.random();	
		doble_rnd = 0.001 * (double)((int)(1000 * doble_rnd));
		return doble_rnd;
	}
	
}
