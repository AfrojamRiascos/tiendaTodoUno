package com.todouno.store.Repositoty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todouno.store.Entity.Venta;

@Repository("ventaRepository")
public interface VentaRepository extends JpaRepository<Venta, Integer>{
	
	public List<Venta> findByIdVenta(int idVenta);
}
