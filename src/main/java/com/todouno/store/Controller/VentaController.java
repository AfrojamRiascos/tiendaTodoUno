package com.todouno.store.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todouno.store.Entity.Venta;
import com.todouno.store.Model.VentaModel;
import com.todouno.store.Repositoty.VentaRepository;
import com.todouno.store.Service.VentaService;

@Controller
@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	@Qualifier("ventaServices")
	VentaService ventaServices;
	
	@Autowired
	@Qualifier("ventaRepository")
	VentaRepository ventaRepository;
	
	@PostMapping("/agregar")
	public ResponseEntity<Venta> addventa(@RequestBody @Validated Venta venta) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ventaServices.Crear(venta));
	}
	
	@GetMapping("/mostrar")
	public List<VentaModel> listaVenta(){
		return ventaServices.listaVentas();
	}
	
	@GetMapping(value = "/")
    public String mostrarVentas(Model model) {
        model.addAttribute("ventas", ventaRepository.findAll());
        return "ventas/ver_ventas";
    }	
}
