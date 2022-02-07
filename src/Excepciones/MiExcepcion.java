package Excepciones;

public class MiExcepcion extends Exception{

	private int codigoException;
	
	public MiExcepcion(int codigoError) {
		super();
		this.codigoException = codigoError;
		
	}
	
	public MiExcepcion() {
		super();
	}
	
	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch(codigoException) {
		case 111:
			mensaje = "El numero de error es 111";
			break;
		case 222:
			mensaje = "El numero de error es 222";
			break;
		case 333:
			mensaje = "El numero de error es 333";
			break;
		}
		
		return mensaje;
	}
	
}
