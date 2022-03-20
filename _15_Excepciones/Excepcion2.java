package _15_Excepciones;

public class Excepcion2 {
	public static void main (String [] args) {
		int den =args.length;
		int coc;
		try {
			coc = 55 /den; // primer error.division por cero. si no hay argumentos
			System.out.println(coc);
			args [42]="25"; // segundo error. si hay menos argumentos
		}
		/*se inspecciona por orden los bloques cath y se ejecutan la 1º que coincida 
		 * con el tipo de excepcion
		 */
		catch (ArithmeticException e) {
			System.out.println("VD. no ha especificado datos de la linea de comandos");
				System.out.println(e.toString());
		}
		//Despues de ejecutar un bloque cath no se ejecuta ninguna de las restantes.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("VD. ha especificado menos de 42 argumentos");
			System.out.println(e.toString());
		}
		//la ejecucion se pasa al final del bloque try /catch
		System.out.println("Continua el programa");
		
	}

}
