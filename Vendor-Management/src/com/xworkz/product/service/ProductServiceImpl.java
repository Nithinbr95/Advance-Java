package com.xworkz.product.service;

import java.time.LocalDateTime;
import java.util.List;

import com.xworkz.complaint.Repository.ComplaintRepoImplementation;
import com.xworkz.complaint.service.ComplaintService;
import com.xworkz.complaint.service.ComplaintServiceImplements;
import com.xworkz.product.Repository.ProductRepoImplementation;
import com.xworkz.product.dto.ProductDto;
import com.xworkz.vendor.dto.ComplaintsDto;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
	private ProductRepoImplementation repositoryimp;
	@Override
	public String validate(ProductDto product) {
		System.out.println("Validated complaint details");
		if(product!=null) {
			if(repositoryimp.save(product)) {
			return "Saved succesfully";
		}
			return "not Saved";
		}
		return "not saved";
	}

	@Override
	public List<ProductDto> getAll() {
		return repositoryimp.getAll();
	}

	@Override
	public String updateById(int productId, ProductDto productdto) {
		if(productId>0) {
			if(repositoryimp.updateById( productId,productdto)) {
			return "updated Succesfully"; 
			}
		}
		return "Not Updated";
	}

	@Override
	public String deleteById(int productId, ProductDto product) {
		if(productId>0) {
			if(repositoryimp.deleteById(productId,product)) {
				return "Deleted Succesfully";
			}
		}
		return "Not Deleted";
	}

}






//

//ComplaintService service = new ComplaintServiceImplements(new ComplaintRepoImplementation());
//System.out.println(service.validate(complaintdto));
//System.out.println(service.getAll());
//ComplaintsDto updatebyid = new ComplaintsDto();
// updatebyid.setComplaintId(23);
// updatebyid.setCompliteName("MisProduct");
// updatebyid.setProductname("EarBuds");
// updatebyid.setDate(LocalDateTime.now());
// System.out.println(service.updateById(23,updatebyid));
// System.out.println(service.getAll());
// String deletedetails = service.deleteById(23,complaintdto);
// System.out.println(deletedetails);
// System.out.println(service.getAll());
