package _15_Excepciones;

public class Excepcion1 {
	public static void main (String [] args) {
		int den = 0;
		int coc = 1;
		try {								//las llaves son obligatorias
			coc = 10 /den;						// -- den = 0 lanza la excepcion
			System.out.println ("Valor del coeficiente; " + coc); // no se ejecutara
		}
		/* la ejecucion no se devolvera desde catch al bloque de try.
		 * ya que no es una llamada lo que se realiza */
	
		catch (ArithmeticException e) {
			System.out.println("Hay un error del tipo:");
			System.out.println(e.toString());
			//devuelve una cadena que contiene la descripcion de la excepcion
			den = 1;
			coc = -1;
		}
		// El control del programa continua despues del bloque catch
		System.out.println ("paso2");
		System.out.println(coc);
		if (coc == -1) coc =10/den;
	}
}
