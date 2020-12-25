package ua.lviv.lgs.task2;

public class home4t2 {
	public static void main(String[] args) {
		
		Helm h = new Helm();
			System.out.println(h);
		h.changBigger();
			System.out.println(h);//System.out.println(h.toString());
			
		Wheel w = new Wheel();
			System.out.println(w);
		w.changBigger();
			System.out.println(w);
			
		Body b = new Body();
			System.out.println(b);
		b.changlength();
			System.out.println(b);
			
		//Car c = new Car("purple", false,new Helm(19.8), new Wheel(28.0), new Body(9.1));
		//	System.out.println(c);
			
			Helm h2 = new Helm(19.8);
			Wheel w2 = new Wheel(28.0);
			Body b2 = new Body(9.1);
			
		Car c2 = new Car("purple", false, h2, w2, b2);
			System.out.println(c2);
			
		c2.setColor("red");
			System.out.println(c2);
			
		c2.setHelm(new Helm(45));
			System.out.println(c2);
		
		c2.changColor();
			System.out.println(c2);
		c2.changAvailable();
			System.out.println(c2);
		c2.changHelm();
			System.out.println(c2);	
		c2.changWheel();
			System.out.println(c2);	
		c2.changBody();
			System.out.println(c2);		
				
			
	}	
}
