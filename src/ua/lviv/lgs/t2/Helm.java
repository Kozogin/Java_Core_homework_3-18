package ua.lviv.lgs.t2;

public class Helm {
	
	private Integer size;
	private String  material;
	
	public Helm() {		
		this.size = 20;
		this.material = "skin";
	}
	
	public Helm(Integer size, String material) {
		this.size = size;
		this.material = material;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [size=" + size + ", material=" + material + "]";
	}

}
