package com.xworkz.product.Repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.product.dto.ProductDto;

public class ProductRepoImplementation implements ProductRepo {
 List<ProductDto>list = new LinkedList<ProductDto>();
	@Override
	public boolean save(ProductDto product) {
		System.out.println("Save method running repo");
		return list.add(product);
	}

	@Override
	public List<ProductDto> getAll() {
		return list;
	}
	public boolean updateById(int prodId, ProductDto product) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getProdId()==prodId) {
					list.set(i, product);
					return true;
				}
			}
		}
		return false;
	}
	public boolean deleteById(int prodId, ProductDto product) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
			if(list.get(i).getProdId()== prodId) {
		        list.remove(product);
		return true;
			}
	}
		}
		return false;

}
}
