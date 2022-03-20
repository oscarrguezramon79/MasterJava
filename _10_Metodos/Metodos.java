package _10_Metodos;

public class Metodos {
	double largo;
	double ancho;

	void valores (double lado) {
		this.largo = lado; this.ancho = lado;
	}
	
	void valores (double largo, double ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	void valores (int largo, int ancho) {
		this.largo = largo;
		this.ancho = ancho;
	}

	public double area () {
		return this.largo * this.ancho;
	}
}
