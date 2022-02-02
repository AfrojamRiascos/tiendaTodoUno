package com.todouno.store.Converter;

import org.springframework.stereotype.Component;

import com.todouno.store.Entity.Venta;
import com.todouno.store.Model.VentaModel;

import java.util.ArrayList;
import java.util.List;

@Component("ventaConverter")
public class VentaConverter {
	
	public List<VentaModel> ventaListConverter(List<Venta> ventas){
		List<VentaModel> ventaModel = new ArrayList<>();
		
		for(Venta sales: ventas) {
			ventaModel.add(new VentaModel(sales));
		}
		return ventaModel;
		
	}
}
