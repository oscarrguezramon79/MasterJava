package _14_Herencia.Productos.vo;

public class voProductos {
	
	private String nombre;
	private String descripcion;
	private float pvp;
	
	public voProductos() {
		this.nombre="";
		this.descripcion ="";
		this.pvp=0;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getNombre() {
		return nombre; 
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public float getPvp() {
		return pvp;
	}
	
	public void setPvp (float pvp) {
		this.pvp = pvp;
	}
}
