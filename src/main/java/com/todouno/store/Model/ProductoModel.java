package com.todouno.store.Model;

import com.todouno.store.Entity.Producto;

public class ProductoModel {
	
    private Integer idProducto;
    private String nombreProducto;
    private String codigoProducto;
    private int precio;
	private int existencia;

	

	public ProductoModel(Integer idProducto, String nombreProducto, String codigoProducto, int precio, int existencia) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.precio = precio;
		this.existencia = existencia;
	}
	
	public ProductoModel(Producto producto) {
		this.idProducto = producto.getIdProducto();
		this.nombreProducto = producto.getNombreProducto();
		this.codigoProducto = producto.getCodigoProducto();
		this.precio = producto.getPrecio();
		this.existencia = producto.getExistencia();
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

}
