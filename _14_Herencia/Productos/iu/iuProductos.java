package _14_Herencia.Productos.iu;

import _14_Herencia.Productos.dao.daoProductos;
import _14_Herencia.Productos.vo.voProductos;

public class iuProductos {
	public static void main (String [] args) {
		voProductos objVoProducto = new voProductos();
		daoProductos objDaoProductos = new daoProductos();
		
		objVoProducto.setNombre ("MicroOndas");
		objVoProducto.setDescripcion("aparato para calentar");
		objVoProducto.setPvp(80.00F);
		
		objDaoProductos.add(objVoProducto);
		
	}
}
