package ua.lviv.lgs.task3;

public class home4_3 {
	public static void main(String[] args) {
		
		Animal an1 = new Animal("Лев",45.8,8);
			System.out.println("Назва тварини = " + an1.getName() 
			+ ", Швидкість тварини = "+ an1.getSpeed() + " км/год, Вік тварини = " + an1.getAge() + " років");
			System.out.println("------------------------------------------------------------------------------");
			
		an1.setName("Ведмідь");
		an1.setSpeed(37.4);
		an1.setAge(12);
			System.out.println("Назва тварини = " + an1.getName() 
			+ ", Швидкість тварини = "+ an1.getSpeed() + " км/год, Вік тварини = " + an1.getAge() + " років");
	
			
	}
}
