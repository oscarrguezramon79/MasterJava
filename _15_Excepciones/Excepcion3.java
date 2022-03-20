package _15_Excepciones;

public class Excepcion3 {
	public static void main(String [] args) {
		int den =0;
		int coc = 1;
		try {
			coc =10/den;
			System.out.println("Valor del cociente: " + coc);
		}
		catch(Exception e){
			System.out.println("Hay error de tipo: ");
			System.out.println(e.toString());
		}
		
		/*se produce un error de compilacion este codigo no es alcanzable. hay que invertir el orden 
		
		catch (ArithmeticException e) {
			System.out.println("hay un error de tipo");
			System.out.println(e.toString());
		}
		*/
	}
}
