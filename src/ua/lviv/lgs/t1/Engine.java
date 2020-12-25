package ua.lviv.lgs.t1;

public class Engine {
	
	private Integer cylinder;

	public Engine() {
		this.cylinder = 4;
	}
	
	public Engine(Integer cylinder) {
		this.cylinder = cylinder;
	}

	public Integer getCylinder() {
		return cylinder;
	}

	public void setCylinder(Integer cylinder) {
		this.cylinder = cylinder;
	}

	@Override
	public String toString() {
		return "Engine [cylinder=" + cylinder + "]";
	}	
}
