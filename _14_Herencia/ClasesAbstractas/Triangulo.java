package _14_Herencia.ClasesAbstractas;

import _14_Herencia.ClasesAbstractas.Figura;

// crea una subclase de Figura

class Triangulo extends Figura{
	Triangulo (double dim1, double dim2){
		super (dim1, dim2);
	}
	
	//sobreescribir el metodo area de la superclase
	double area() {
		System.out.println("Area del Triangulo: " + dim1 * dim2 /2);
		return dim1 * dim2 /2;
	}

}
