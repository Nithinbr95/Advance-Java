package com.xworkz.set.repository;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.set.dto.MobileDto;

public class MobileRepositoryImpl implements MobileRepository {
   Set<MobileDto>sets = new HashSet<MobileDto>();
	@Override
	public boolean save(MobileDto mobiledto) {
	
		return sets.add(mobiledto);
	}
	@Override
	public Set<MobileDto> getAll() {
		
		return sets;
	}

}
