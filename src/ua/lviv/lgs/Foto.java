package ua.lviv.lgs;

import java.io.Serializable;
import java.util.Comparator;

public class Foto extends Album implements Comparator<Foto>, Serializable{
	
	public  String name;
	private String href;
	private int width;
	private int height;
	
	public Foto() {}
	
	public Foto(int width, int height) {
		super();		
		this.width = width;
		this.height = height;
	}
	
	public Foto(String name, String href, int width, int height) {
		super();
		this.name = name;
		this.href = href;
		this.width = width;
		this.height = height;
	}
	
	public void setAll(String name, String href, int width, int height) {
		this.name = name;
		this.href = href;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foto other = (Foto) obj;
		if (height != other.height)
			return false;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Foto [name=" + name + ", href=" + href + ", width=" + width + ", height=" + height + "]";
	}

	@Override
	public int compare(Foto o1, Foto o2) {		
		return o1.getName().equals(o2.getName()) ? 1 : -1;
	}

}
