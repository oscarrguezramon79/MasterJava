package _15_Excepciones.CrearExcepciones;

public class Pruebas {
	public static void main (String arg[]) {
		try {
			Intervalos.isIntervalo1(11);
		}catch (FueraIntervaloException e) {
			System.out.println(e);
		}
		
	}

}
