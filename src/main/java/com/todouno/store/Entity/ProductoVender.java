package com.todouno.store.Entity;


public class ProductoVender extends Producto {

	private int cantidad;

	public ProductoVender(Integer idProducto, String nombreProducto, String codigoProducto, int precio, int existencia,
			int cantidad) {
		super(idProducto, nombreProducto, codigoProducto, precio, existencia);
		this.cantidad = cantidad;
	}

	public ProductoVender(String nombreProducto, String codigoProducto, int precio, int existencia, int cantidad) {
		super();
		this.cantidad = cantidad;
	}
	
	public void aumentarCantidad() {
        this.cantidad++;
    }

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
