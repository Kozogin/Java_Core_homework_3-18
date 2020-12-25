package ua.lviv.lgs.t3;

public class Main3 {
	public static void main(String[] args) {
		
		Frog f = new Frog();
		Amphibia frog = (Amphibia) f;
		
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();		
	}
}
