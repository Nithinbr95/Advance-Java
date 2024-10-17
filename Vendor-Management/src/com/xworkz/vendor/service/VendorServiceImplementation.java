package com.xworkz.vendor.service;

import java.util.List;

import com.xworkz.vendor.Repository.VendorRepositoryimplementation;
import com.xworkz.vendor.dto.VendorDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VendorServiceImplementation implements VendorService {
	private VendorRepositoryimplementation repositoryimp;
	
	@Override
	public String validate(VendorDto vendordto) {
		System.out.println("Validated vendordto details");
		if(vendordto!=null) {
			if(repositoryimp.save(vendordto)) {
			return "Saved succesfully";
		}
			return "not Saved";
		}
		return "not saved";
	}

	@Override
	public List<VendorDto> getAll() {
		
		return repositoryimp.getAll();
	}

	@Override
	public String updateById(int vendorId,VendorDto vendordto) {
		if(vendorId>0) {
			if(repositoryimp.updateById( vendorId,vendordto)) {
			return "updated Succesfully"; 
		}	
	}
     return "Not Updated";
}

	@Override
	public String deleteById(int vendorId, VendorDto dto) {
		if(vendorId>0) {
			if(repositoryimp.deleteById(vendorId,dto)) {
				return "Deleted Succesfully";
			}
		}
		return "Not Deleted";
	}
}