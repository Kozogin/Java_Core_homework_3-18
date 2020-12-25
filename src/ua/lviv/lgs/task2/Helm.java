package ua.lviv.lgs.task2;

public class Helm {

	private double m_size;
	
	Helm(){
		this.m_size = 13.2;
	}
	
	Helm(double m_size){
		super();
		this.m_size = m_size;
	}
	
	public double changBigger() {
		this.m_size *= 1.2;
		 return this.m_size;
	}

	public double getM_size() {
		return m_size;
	}

	public void setM_size(double m_size) {
		this.m_size = m_size;
	}

	public String toString() {
		return "Helm [m_size=" + m_size + "]";
	}
	
	
	
}
