package ua.lviv.lgs;

public class Application {
	
	public static void main(String[] args) {
		
		Cy_27 cy27 = new Cy_27(18.5,25.3,14650,2205,"grey");
		
		cy27.startEngine();
		cy27.flyingPlane();
		
		cy27.moveUp();		
		cy27.moveRight();
		cy27.moveLeft();
		cy27.moveDown();
		
		cy27.stealth();
		cy27.nuclearStrike();
		cy27.forsage();
		
		cy27.landingPlane();		
	}
	
}
