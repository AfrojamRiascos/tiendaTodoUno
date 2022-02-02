package com.todouno.store.Model;

import java.sql.Date;
import java.util.Set;

import com.todouno.store.Entity.ProductoVendido;
import com.todouno.store.Entity.Venta;

public class VentaModel {
	
	private Integer idVenta;	
    private Date fechaVenta;
    private Set<ProductoVendido> producto;
	
    public VentaModel(Integer idVenta, Date fechaVenta, Set<ProductoVendido> producto) {
		this.idVenta = idVenta;
		this.fechaVenta = fechaVenta;
		this.producto = producto;
	}

	public VentaModel(Venta venta) {
		this.producto = venta.getProductos();
		this.fechaVenta = venta.getFechaVenta();
	}
	
	public VentaModel() {
		
	}

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Set<ProductoVendido> getProducto() {
		return producto;
	}

	public void setProducto(Set<ProductoVendido> producto) {
		this.producto = producto;
	}
}
