package ua.lviv.lgs.task3;

public class home4_3 {
	public static void main(String[] args) {
		
		Animal an1 = new Animal("���",45.8,8);
			System.out.println("����� ������� = " + an1.getName() 
			+ ", �������� ������� = "+ an1.getSpeed() + " ��/���, ³� ������� = " + an1.getAge() + " ����");
			System.out.println("------------------------------------------------------------------------------");
			
		an1.setName("������");
		an1.setSpeed(37.4);
		an1.setAge(12);
			System.out.println("����� ������� = " + an1.getName() 
			+ ", �������� ������� = "+ an1.getSpeed() + " ��/���, ³� ������� = " + an1.getAge() + " ����");
	
			
	}
}
