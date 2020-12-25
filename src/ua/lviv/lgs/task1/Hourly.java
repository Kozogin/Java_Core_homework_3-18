package ua.lviv.lgs.task1;

public class Hourly implements Salary{
	
	int day;
	
	public Hourly() {
		this.day = 0;
	}
		
	public Hourly(int day) {
		super();
		this.day = day;
	}

	@Override
	public double salary() {		
		return 8 * this.day * PER_HOUR;
	}

	public void print(double money) {
		System.out.println("��������� � ���������� ��������� �� " + day 
		+ " ������ �� ������ "+ money + " ���");
	}
}
