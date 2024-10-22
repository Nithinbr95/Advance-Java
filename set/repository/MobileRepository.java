package com.xworkz.set.repository;

import java.util.Set;

import com.xworkz.set.dto.MobileDto;

public interface MobileRepository {

	public boolean save(MobileDto mobiledto);

	 Set<MobileDto> getAll();

}
