package ua.lviv.ua;

public class Home4 {
	public static void main(String[] args) {
		
		Robot r = new Robot();
		r.work();
		
		CoffeRobot cr = new CoffeRobot();
		cr.work();
		
		RobotDancer rd = new RobotDancer();
		rd.work();
		
		RobotCoocker rñ = new RobotCoocker();
		rñ.work();
		
		//array
			System.out.println();
		Robot [] robo = new Robot[4];
		robo[0] = r;
		robo[1] = cr;
		robo[2] = rd;
		robo[3] = rñ;
		
		for(int i = 0;i < 4;++i) {
			robo[i].work();
		}
	}
}
