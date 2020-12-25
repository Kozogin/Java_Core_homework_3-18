package ua.lviv.lgs.t1;

public class WrongInputConsoleParametersException extends Exception{
	
	private String parametr;

	public WrongInputConsoleParametersException(String parametr) {
		super(parametr);
		this.parametr = parametr;
	}

	public String getParametr() {
		return parametr;
	}
}
