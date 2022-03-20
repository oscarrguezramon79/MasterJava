package _15_Excepciones.CrearExcepciones;

public class Intervalos {
	static boolean isIntervalo1 (int num) throws FueraIntervaloException{
		if (num <=1 || num >= 10)
			throw new FueraIntervaloException(1);
		return true;
	}
	static boolean isIntervalo2 (int num) throws FueraIntervaloException{
		if (num <= 11 || num>= 100)
			throw new FueraIntervaloException(2);
			return true;
	}

}
