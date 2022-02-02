package com.todouno.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todouno.store.Entity.Producto;
import com.todouno.store.Model.ProductoModel;
import com.todouno.store.Service.ProductoService;

@Controller
@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	@Qualifier("productoService")
	ProductoService productoServicio;

	@PostMapping("/agregar")
	public ResponseEntity<Producto> addProducto(@RequestBody @Validated Producto producto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productoServicio.Crear(producto));
	}
	
	@PutMapping("/editar")
	public ResponseEntity<Producto> editarProducto(@RequestBody @Validated Producto producto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(productoServicio.Editar(producto));
	}

	@GetMapping("/mostrar")
	public List<ProductoModel> listProducto(){
		return productoServicio.listaProducto();
	}
	
	@DeleteMapping("/eliminar/{id}/{nombreProducto}")
	public boolean deleteArticulo(@PathVariable("id") int idProducto, @PathVariable("nombreProducto") String nombreProducto) {
		return productoServicio.Eliminar(nombreProducto, idProducto);
	}

}
