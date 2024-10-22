package com.xworkz.set.service;

import java.util.Set;

import com.xworkz.set.dto.MobileDto;

public interface MobileService {

	String validate(MobileDto mobiledto);

	Set<MobileDto> getAll();

}
