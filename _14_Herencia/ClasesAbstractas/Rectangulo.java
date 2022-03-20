package _14_Herencia.ClasesAbstractas;

import _14_Herencia.ClasesAbstractas.Figura;

// crear la otra subclase de figura
class Rectangulo extends Figura {
	Rectangulo (double dim1, double dim2){
		super(dim1, dim2);
	}
	// sobreescribir el metodo area de la superclase
	
	double area() {
		System.out.println ("Area del rectangulo: "+ dim1 *dim2);
		return dim1 * dim2;
	}
}
