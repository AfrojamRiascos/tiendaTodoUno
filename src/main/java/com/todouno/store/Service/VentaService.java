package com.todouno.store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todouno.store.Converter.VentaConverter;
import com.todouno.store.Entity.Producto;
import com.todouno.store.Entity.Venta;
import com.todouno.store.Model.ProductoModel;
import com.todouno.store.Model.VentaModel;
import com.todouno.store.Repositoty.VentaRepository;

@Service("ventaServices")
public class VentaService {
	
	@Autowired
	@Qualifier("ventaRepository")
	private VentaRepository ventaRepositorio;
	
	@Autowired
	@Qualifier("ventaConverter")
	private VentaConverter ventaConverter;
	
	public Venta Crear(Venta venta) {
		try {
			return ventaRepositorio.save(venta);
		} catch (Exception e) {
			System.out.println("Error al guardar la información!");
		}
		return null;
	}
	
	public List<VentaModel> listaVentas() {
		return ventaConverter.ventaListConverter((List<Venta>) ventaRepositorio.findAll());
	}

}
