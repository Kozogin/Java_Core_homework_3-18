package ua.lviv.lgs.task1;

public interface Salary {
	double PER_HOUR = 100;
	double PER_MONTH = 15360;
	
	double salary();
	
	void print(double money);
}
