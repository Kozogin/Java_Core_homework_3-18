package ua.lviv.lgs;

public class Circle {
	private float m_diameter;
	private float m_radius;
	private final float pi = 3.14159f;
	
	Circle(){
		this.m_diameter = 12.5f;
		this.m_radius = 6.25f;
	}
	
	Circle(float diameter, float radius){
		this.m_diameter = diameter;
		this.m_radius = radius;
		if(this.m_diameter/2 != this.m_radius) {
			this.m_diameter = 0;
			this.m_radius = 0;
		}
	}
	
	public float getSquare() {
		return pi * this.m_diameter * this.m_diameter/4;
	}
	
	public float getPerimeter() {
		return 2 * pi * this.m_radius;
	}
	
	public void print(float d_square,float d_perimeter) {
		System.out.println();
		System.out.println("Площа круга = " + d_square); 
		System.out.println("Периметр кола = " + d_perimeter);
	}	
}
