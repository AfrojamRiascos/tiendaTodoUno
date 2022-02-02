package com.todouno.store.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductoVendido {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int cantidad; 
    private int precio;
    private String nombre;
    private String codigo;
    @ManyToOne
    @JoinColumn
    private Venta venta;
	
    public ProductoVendido(Integer id, int cantidad, int precio, String nombre, String codigo,
			com.todouno.store.Entity.Venta venta) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
		this.nombre = nombre;
		this.codigo = codigo;
		this.venta = venta;
	}
    
    public ProductoVendido() {
    
    }
    
    public Float getTotal() {
        return (float) (this.cantidad * this.precio);
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
    
}
