package com.xworkz.vendor.Repository;

import java.util.List;

import com.xworkz.vendor.dto.VendorDto;

public interface VendorRepository {
  
	boolean save(VendorDto vedordto);
	List<VendorDto>getAll();
}
