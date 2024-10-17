package com.xworkz.vendor.service;

import java.util.List;

import com.xworkz.vendor.dto.VendorDto;

public interface VendorService {

	String validate(VendorDto venderdto);

	List<VendorDto> getAll();

	String updateById(int vendorId,VendorDto vendordto);

	String deleteById(int venderId, VendorDto dto);
}
