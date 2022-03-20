package _10_Metodos.Encapsulacion;

public class areasEncapsulacion {

	private float largo;
	private float ancho;
	
	areasEncapsulacion(float largo, float ancho){  // constructor: mismo nombre q la clase, puede haber varios, cambia el numero de pararmetros de entrada y en el tipo de los datos
		this.setLargo(largo);			// llamada a los metodos
		this.setAncho(ancho);
		
		
	}
	areasEncapsulacion(){  // metodos sobrecargados
		this.setLargo(0);	
		this.setAncho(0);
		
		
	}
					//parametros -> (float value)
	void setLargo (float value){  // metodo setter
		if (value < 0)
			this.largo=0;
		else
			this.largo = value;
	}
	void setLargo (double largo){  // metodo setter
		if (largo < 0)
			this.largo=0;
		else
			this.largo = (float)largo; // conversion por CAST -> CONVIERTE  UN TIPO DE VARIABLE EN OTRO
	}
	
	float getLargo (){         // metodo getter
		return this.largo;
	}
	
	void setAncho (float value){
		if (value < 0)
			this.ancho=0;
		else
			this.ancho = value;
	}
	
	float getAncho (){
		return this.ancho;
	}
	
	
	
	double areaRectangulo(){
		return largo * ancho;
	}

	double areaRectangulo(float largo,float ancho){
		this.setLargo(largo);			// metodo sobrecargado.mismo nombre del metodo. llamandolo a otro metodo
		this.setAncho(ancho);
		return this.areaRectangulo();
	}
}
