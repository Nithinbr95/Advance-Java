package com.xworkz.product.service;

import java.util.List;

import com.xworkz.product.dto.ProductDto;


public interface ProductService {
	String validate(ProductDto complaintdto);

	List<ProductDto> getAll();

	String updateById(int productId, ProductDto productdto);

	String deleteById(int productId, ProductDto product);
}
