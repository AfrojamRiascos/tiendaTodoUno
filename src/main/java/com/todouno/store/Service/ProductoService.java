package com.todouno.store.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.todouno.store.Converter.ProductoConverter;
import com.todouno.store.Entity.Producto;
import com.todouno.store.Model.ProductoModel;
import com.todouno.store.Repositoty.ProductoRepository;

@Service("productoService")
public class ProductoService {

	@Autowired
	@Qualifier("productoRepository")
	private ProductoRepository productoRepositorio;

	@Autowired
	@Qualifier("productoConverter")
	private ProductoConverter productoConverter;

	public Producto Crear(Producto producto) {
		try {
			return productoRepositorio.save(producto);
		} catch (Exception e) {
			System.out.println("Error al guardar la información!");
		}
		return null;
	}

	public Producto Editar(Producto producto) {
		try {
			return productoRepositorio.save(producto);
		} catch (Exception e) {
			System.out.println("Error al Editar la información!");
		}
		return null;
	}
	
	public boolean Eliminar(String nombreProducto, int idProducto) {

		try {
			Producto producto = productoRepositorio.findByNombreProductoAndIdProducto(nombreProducto, idProducto);
			productoRepositorio.delete(producto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<ProductoModel> listaProducto() {
		return productoConverter.ProductListConverter((List<Producto>) productoRepositorio.findAll());
	}

}
