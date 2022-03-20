package _15_Excepciones.CrearExcepciones;

public class FueraIntervaloException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigo;
	FueraIntervaloException (int codigo){
		this.codigo = codigo;
	}
	public String toString() {
		switch (this.codigo) {
			case 1:
				return "Fuera del limite de 1 a 10";
				//break;
			case 2:
				return "Fuera del limite de 11 a 100";
				//break;
			default:
				return "Fuera del limite";
		}
	}
}
