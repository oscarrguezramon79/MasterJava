package _10_Metodos.Encapsulacion;

public class Iniciar {

	public static void main(String[] args) {            // argumentos ->(15.40F,10.40F)     
	
		areasEncapsulacion area = new areasEncapsulacion(15.40F,10.40F);  // instanciar
		System.out.println("area:" + area.areaRectangulo()); // mostrar en pantalla
	
	}
}