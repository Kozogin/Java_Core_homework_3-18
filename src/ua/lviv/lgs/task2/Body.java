package ua.lviv.lgs.task2;

public class Body {

	private double m_length;

	public Body() {
		this.m_length = 12.45;;
	}
	
	Body(double m_length){
		super();
		this.m_length = m_length;
	}
	
	public double changlength() {
		this.m_length += 1.54;
		return this.m_length;
	}

	public double getM_length() {
		return m_length;
	}

	public void setM_length(double m_length) {
		this.m_length = m_length;
	}

	public String toString() {
		return "Body [m_length=" + m_length + "]";
	}
	
}
