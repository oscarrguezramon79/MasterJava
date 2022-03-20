package _14_Herencia.Productos.vo;

public class voProductoBlanco extends voProductos {
	private String voltaje;
	private float largo;
	private float ancho;
	private float alto;
	
	public voProductoBlanco() {
		this.voltaje = "220";
		this.largo = 0;
		this.ancho = 0;
		this.alto = 0;
	}

	public float getAlto() {
		return alto;
	}
	
	public void setAlto (float alto) {
		this.alto = alto;
	}
	
	public float getAncho() {
		return ancho;
	}
	
	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	public float getLargo() {
		return largo;
	}
	
	public void setLargo (float largo) {
		this.largo = largo;
	}
	
	public String getVoltaje () {
		return voltaje;
	}
	
	public void setVoltaje (String voltaje) {
		this.voltaje = voltaje;
	}
	

}
