package ua.lviv.lgs.t2;

public class Application {
	public static void main(String[] args) {
		double[] a = { -2,   0, -5.4, 0, 8.4 };
		double[] b = { -1.4, 2,    0, 0, 4 };
		double c;
		
		for (int i = 0; i < a.length;i++) {
			c = Methods.add(a[i],b[i]);
			print(c);
			
			c = Methods.subtract(a[i],b[i]);
			print(c);
			
			c = Methods.multiply(a[i],b[i]);
			print(c);
			
			c = Methods.divide(a[i],b[i]);
			print(c);
			
			System.out.println();
			
		}
		
	
	}
	static void print(double c) {
		System.out.println(c);
	}
}
