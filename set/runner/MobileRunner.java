package com.xworkz.set.runner;

import com.xworkz.set.dto.MobileDto;
import com.xworkz.set.repository.MobileRepositoryImpl;
import com.xworkz.set.service.MobileService;
import com.xworkz.set.service.MobileServiceimpl;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class MobileRunner {
public static void main(String[] args) {
	MobileDto mobiledto = new MobileDto();
	mobiledto.setName("Vivo");
	mobiledto.setPrice(20000);
	mobiledto.setWeight(20f);
	mobiledto.setCapacity("5000mh");
	mobiledto.setMadeIn("India");
	MobileService service = new MobileServiceimpl(new MobileRepositoryImpl());
	service.validate(mobiledto);
	System.out.println(service.getAll());
}
}
