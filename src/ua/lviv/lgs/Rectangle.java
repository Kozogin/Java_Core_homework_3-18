package ua.lviv.lgs;

public class Rectangle {
	private int m_length;
	private int m_width;
	
	Rectangle(){
		this.m_length = 12;
		this.m_width = 8;
	}
	
	Rectangle(int length, int width){
		this.m_length = length;
		this.m_width = width;
	}
	
	public int getSquare() {
		return this.m_length * this.m_width;
	}
	
	public int getPerimeter() {
		return 2 * this.m_length + 2 * this.m_width;
	}
	
	public void print(int d_square,int d_perimeter) {
		System.out.println();
		System.out.println("Площа прямокутника = " + d_square); 
		System.out.println("Периметр прямокутника = " + d_perimeter);
	}	
}
