package com.xworkz.complaint.service;

import java.util.List;

import com.xworkz.complaint.Repository.ComplaintRepoImplementation;
import com.xworkz.vendor.dto.ComplaintsDto;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintServiceImplements implements ComplaintService {
	private ComplaintRepoImplementation repositoryimp;
	
	@Override
	public String validate(ComplaintsDto complaintdto) {
		System.out.println("Validated complaint details");
		if(complaintdto!=null) {
			if(repositoryimp.save(complaintdto)) {
			return "Saved succesfully";
		}
			return "not Saved";
		}
		return "not saved";
	}


	@Override
	public List<ComplaintsDto> getAll() {
		return repositoryimp.getAll();
	}

	
	@Override
	public String updateById(int complaintId, ComplaintsDto complaintdto) {
		if(complaintId>0) {
			if(repositoryimp.updateById( complaintId,complaintdto)) {
			return "updated Succesfully"; 
		}	
	}
     return "Not Updated";
	}

	
	@Override
	public String deleteById(int complaintId, ComplaintsDto dto) {
		if(complaintId>0) {
			if(repositoryimp.deleteById(complaintId,dto)) {
				return "Deleted Succesfully";
			}
		}
		return "Not Deleted";
	}

}
