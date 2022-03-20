package _14_Herencia;

class Cuadrado {
	int lngLado; 
	void lado (int lado) {
		this.lngLado = lado;
	}
	void lado() {
		lado(1);
	}
	long area() {
		return this.lngLado * this.lngLado;
	}
}
