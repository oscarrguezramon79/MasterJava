package _14_Herencia.Productos.iu;

import _14_Herencia.Productos.dao.daoProductos;
import _14_Herencia.Productos.vo.voProductoBlanco;

public class iuProductos2 {
	public static void main (String [] args) {
		voProductoBlanco objVoProductoBlanco = new voProductoBlanco();
		daoProductos objDaoProductos = new daoProductos();
		
		objVoProductoBlanco.setNombre("MicroOndas");
		objVoProductoBlanco.setDescripcion("Aparato para calentar");
		objVoProductoBlanco.setPvp(80.00F);
		objVoProductoBlanco.setLargo(55.00F);
		objVoProductoBlanco.setAncho(42.00F);
		objVoProductoBlanco.setAlto(38.00F);
		
		objDaoProductos.add(objVoProductoBlanco);
		
		
	}

}
