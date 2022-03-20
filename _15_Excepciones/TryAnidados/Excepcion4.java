package _15_Excepciones.TryAnidados;

public class Excepcion4 {
	public static void main (String [] args) {
		byte num1;
		long num2;
		try {
			if (args.length < 0) {
				num1 = Byte.parseByte(args[0]);
				System.out.println(num1);
				try {
					num2 =Long.parseLong(args[1]);
					System.out.println(num2);
				}
				catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Introduzca un dato tipo LONG");
				}
			}
		}
		
		/* si el bloque try interno no tiene bloque catch para un excepcion determinada 
		  se busca en los gestores catch de los bloques esteriores */
		
		catch (NumberFormatException e) {
			System.out.println(e);
			System.out.println("Introduzca un dato tipo BYTE");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Introduzca un segundo parametro, por favor");
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println("Repare el error, por favor");
		}
	}
}
