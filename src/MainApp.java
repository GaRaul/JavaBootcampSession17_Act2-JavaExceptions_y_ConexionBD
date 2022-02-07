import Excepciones.MiExcepcion;

public class MainApp {

	public static void main(String[] args) {

		int numeroError;
		
		try {
			
			System.out.println("Mensaje mostrado por pantalla.");
			
			numeroError = 222;
			
			if (numeroError == 111) {throw new MiExcepcion(111);}
			else if (numeroError == 222) {throw new MiExcepcion(222);}
			else if (numeroError == 333) {throw new MiExcepcion(333);}
			
		} catch (MiExcepcion e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("El programa ha terminado.");
		}

	}

}
