package com.xworkz.complaint.Repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.vendor.dto.ComplaintsDto;

public class ComplaintRepoImplementation implements ComplaintRepository {

	List<ComplaintsDto>list = new ArrayList<ComplaintsDto>();
	@Override
	public boolean save(ComplaintsDto complaintdto) {
		System.out.println("Save method running repo");
		return list.add(complaintdto);
}
	public List<ComplaintsDto> getAll() {
		
		return list;
	}
	public boolean updateById(int complaintId, ComplaintsDto complaintdto) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getComplaintId()==complaintId) {
					list.set(i, complaintdto);
					return true;
				}
			}
		}
		return false;
	}
	public boolean deleteById(int complaintId, ComplaintsDto dto) {
		if(!list.isEmpty()) {
			for(int i=0;i<list.size();i++) {
			if(list.get(i).getComplaintId()== complaintId) {
		        list.remove(dto);
		return true;
			}
	}
		}
		return false;
}
}

