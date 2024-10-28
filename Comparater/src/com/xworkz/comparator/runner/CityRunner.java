package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.comparator.dto.CityDto;

public class CityRunner {

	public static void main(String[] args) {
		List<CityDto>dto = new ArrayList<CityDto>();
		dto.add(new CityDto("BNG", 200000));
		dto.add(new CityDto("CTA", 250000));
		dto.add(new CityDto("CMG", 350000));
		
		
	}
}
