package com.todouno.store.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_producto")
    private Integer idProducto;

	@Column(name = "nombre_producto")
    private String nombreProducto;

	@Column(name = "codigo_producto")
    private String codigoProducto;

	@Column(name = "precio")
    private int precio;

	@Column(name = "existencia")
    private int existencia;

	public Producto(Integer idProducto, String nombreProducto, String codigoProducto, int precio, int existencia) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.codigoProducto = codigoProducto;
		this.precio = precio;
		this.existencia = existencia;
	}

	public Producto() {
		
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
