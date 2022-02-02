package com.todouno.store.Entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Venta {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVenta;
	
    private Date fechaVenta;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private Set<ProductoVendido> productos;

	public Venta(Integer idVenta, Date fechaVenta, Set<ProductoVendido> productos) {
		super();
		this.idVenta = idVenta;
		this.fechaVenta = fechaVenta;
		this.productos = productos;
	}
    
    public Venta() {
    	
    }
    
    public Float getTotal() {
		Float total = 0f;
		for (ProductoVendido productoVendido : this.productos) {
			total += productoVendido.getTotal();
		}
		return total;
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

	public Set<ProductoVendido> getProductos() {
		return productos;
	}

	public void setProductos(Set<ProductoVendido> productos) {
		this.productos = productos;
	}
}
