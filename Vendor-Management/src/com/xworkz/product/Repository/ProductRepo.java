package com.xworkz.product.Repository;

import java.util.List;

import com.xworkz.product.dto.ProductDto;

public interface ProductRepo {
	boolean save(ProductDto product);
	List<ProductDto>getAll();
}
