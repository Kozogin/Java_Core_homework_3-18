package ua.lviv.lgs;

public class Home3JC {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(20, 5);
		
			int rect_square;
			int rect_perimete;
		
		rect_square = rectangle1.getSquare();			
		rect_perimete = rectangle1.getPerimeter();		
			rectangle1.print(rect_square, rect_perimete);
			
		rect_square = rectangle2.getSquare();			
		rect_perimete = rectangle2.getPerimeter();		
			rectangle1.print(rect_square, rect_perimete);
			
			float circ_square;
			float circ_perimete;
			
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(20.8f, 10.4f);
		
		circ_square = circle1.getSquare();			
		circ_perimete = circle1.getPerimeter();		
			circle1.print(circ_square, circ_perimete);
		
		circ_square = circle2.getSquare();			
		circ_perimete = circle2.getPerimeter();		
			circle2.print(circ_square, circ_perimete);
	}
}
