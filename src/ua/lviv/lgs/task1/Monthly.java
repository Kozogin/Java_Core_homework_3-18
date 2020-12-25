package ua.lviv.lgs.task1;

public class Monthly implements Salary{
	
	int day;
	
	public Monthly() {
		this.day = 0;
	}
	
	public Monthly(int day) {
		super();
		this.day = day;
	}

	@Override
	public double salary() {		
		return PER_MONTH * this.day / 22;
	}

	public void print(double money) {
		System.out.println("Працівник з місячною зарплатою за " + day 
		+ " робочі дні отримає "+ money + " грн");
	}

}
