package com.xworkz.set.service;

import java.util.Set;

import com.xworkz.set.dto.MobileDto;
import com.xworkz.set.repository.MobileRepository;
import com.xworkz.set.repository.MobileRepositoryImpl;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class MobileServiceimpl implements MobileService {
	MobileRepository repo = new MobileRepositoryImpl();

	@Override
	public String validate(MobileDto mobiledto) {
		System.out.println("Validate method running");
		if(mobiledto!=null) {
			if(repo.save(mobiledto)) {
				return "Saved Succesfully";
			}
		}
		return "Not saved";
	}

	@Override
	public Set<MobileDto> getAll() {
		
		return repo.getAll();
	}

	

}
