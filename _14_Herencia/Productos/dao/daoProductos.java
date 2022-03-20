package _14_Herencia.Productos.dao;

import _14_Herencia.Productos.vo.voProductoBlanco;
import _14_Herencia.Productos.vo.voProductos;

public class daoProductos {

	public void add (voProductos objVoProducto) {
			System.out.println(objVoProducto.getNombre());
			System.out.println(objVoProducto.getDescripcion());
			System.out.println(objVoProducto.getPvp());
	}
	
	public void add (voProductoBlanco objVoProductoBlanco) {
		
		this.add( (voProductos) objVoProductoBlanco);
		
		System.out.println(objVoProductoBlanco.getLargo());
		System.out.println(objVoProductoBlanco.getAncho());
		System.out.println(objVoProductoBlanco.getAlto());
		
	}
	
	
}
