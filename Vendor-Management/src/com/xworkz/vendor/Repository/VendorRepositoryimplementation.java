package com.xworkz.vendor.Repository;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.vendor.dto.VendorDto;

public class VendorRepositoryimplementation implements VendorRepository {
    List<VendorDto>list = new LinkedList<VendorDto>();
	@Override
	public boolean save(VendorDto vendordto) {
		System.out.println("Save method running repo");
		return list.add(vendordto);
	
		

}
	public List<VendorDto> getAll() {
		
		return list;
	}
	public boolean updateById(int vendorId, VendorDto vendordto) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getVendorId()==vendorId) {
					list.set(i, vendordto);
					return true;
				}
			}
		}
		return false;
	}
	public boolean deleteById(int vendorId, VendorDto dto) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
			if(list.get(i).getVendorId()==vendorId) {
		        list.remove(dto);
		return true;
			}
	}
		}
		return false;
}
}
