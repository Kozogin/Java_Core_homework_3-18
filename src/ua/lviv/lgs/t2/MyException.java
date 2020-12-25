package ua.lviv.lgs.t2;

public class MyException extends Exception{
	
	private String parametr;

	public MyException(String parametr) {
		super(parametr);
		this.parametr = parametr;
	}

	public String getParametr() {
		return parametr;
	}

}
