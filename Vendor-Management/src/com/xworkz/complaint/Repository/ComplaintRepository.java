package com.xworkz.complaint.Repository;

import java.util.List;

import com.xworkz.vendor.dto.ComplaintsDto;


public interface ComplaintRepository {
	  
	boolean save(ComplaintsDto complaint);
	List<ComplaintsDto>getAll();
	}