package com.todouno.store.Repositoty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todouno.store.Entity.ProductoVendido;

@Repository("productoVendidoRepository")
public interface ProductoVendidoRepository extends CrudRepository<ProductoVendido, Integer>{

}
