package ua.lviv.lgs.task2;

public class Wheel {

	private double m_value;

	public Wheel() {
		this.m_value = 24.5;
	}
	
	Wheel(double m_value){
		super();
		this.m_value = m_value;
	}
	
	public double changBigger() {
		this.m_value *= 1.1;
		 return this.m_value;
	}

	public double getM_value() {
		return m_value;
	}

	public void setM_value(double m_value) {
		this.m_value = m_value;
	}

	public String toString() {
		return "Wheel [m_value=" + m_value + "]";
	}

	
	
	
	
}
