package ua.lviv.ua;

public class Robot {
	
		private String robot_type;
		
	
	Robot() {
		this.robot_type = "� Robot - � ������ ������";		
	}
	
	Robot(String robot_type) {
		this.robot_type = robot_type;		
	}
	
	public void work() {
		System.out.println(this.robot_type);
	}	
}
