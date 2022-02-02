package com.todouno.store.Converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.todouno.store.Entity.Producto;
import com.todouno.store.Model.ProductoModel;

@Component("productoConverter")
public class ProductoConverter {
	
	public List<ProductoModel> ProductListConverter(List<Producto> producto){
		List<ProductoModel> productoModel = new ArrayList<>();
		
		for(Producto product: producto) {
			productoModel.add(new ProductoModel(product));
		}
		return productoModel;
	}

}
