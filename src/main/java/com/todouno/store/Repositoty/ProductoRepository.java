package com.todouno.store.Repositoty;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todouno.store.Entity.Producto;

@Repository("productoRepository")
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
	
	public List<Producto> findByIdProducto(int idProducto);
	public List<Producto> findByNombreProducto(String nombreProducto);
	Producto findFirstByCodigoProducto(String codigoProducto);
	public Producto findByNombreProductoAndIdProducto(String nombreProducto, int idProducto);
}
