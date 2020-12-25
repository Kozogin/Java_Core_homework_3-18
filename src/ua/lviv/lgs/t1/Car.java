package ua.lviv.lgs.t1;

public class Car {
	
	private Integer horsepower;
	private Integer produced;
	
	Helm helm =  new Helm();
	Engine engine = new Engine();
	
	public Car() {
		this.horsepower = 70;
		this.produced = 2015;
	}
	
	public Car(Integer horsepower, Integer produced, Helm helm, Engine engine) {
		this.horsepower = horsepower;
		this.produced = produced;		
		this.helm = helm;
		this.engine = engine;
	}
	
	public Integer getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(Integer horsepower) {
		this.horsepower = horsepower;
	}

	public Integer getProduced() {
		return produced;
	}

	public void setProduced(Integer produced) {
		this.produced = produced;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return " [horsepower=" + horsepower + ", produced=" + produced + ", helm=" + helm + ", engine=" + engine
				+ "]";
	}

	
}
