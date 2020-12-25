package ua.lviv.lgs;

public class ControlsPlane{
	
	void moveUp() {
		System.out.println("Plane moving UP on " + (int) Cy_27.rnd(0,15) + " km");
	}
	
	void moveDown() {
		System.out.println("Plane moving DOWN on " + (int) Cy_27.rnd(0,15) + " km"); 
	}
	
	void moveLeft() {
		System.out.println("Plane moving LEFT on " + (int) Cy_27.rnd(0,100) + " km");
	}
	
	void moveRight() {
		System.out.println("Plane moving RIGHT on " + (int) Cy_27.rnd(0,100) + " km");
	}
	
	
	
}
