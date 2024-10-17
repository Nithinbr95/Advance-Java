package com.xworkz.complaint.service;

import java.util.List;

import com.xworkz.vendor.dto.ComplaintsDto;

public interface ComplaintService {

	String validate(ComplaintsDto complaintdto);

	List<ComplaintsDto> getAll();

	String updateById(int complaintId, ComplaintsDto complaintdto);

	String deleteById(int complaintId, ComplaintsDto dto);

}
