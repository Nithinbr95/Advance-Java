package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.dto.PlanetsDto;

public class PlanetsRunner {
 public static void main(String[] args) {
	List<PlanetsDto>dto = new ArrayList<PlanetsDto>();
	dto.add(new PlanetsDto("Mars", 6792, 641));
	dto.add(new PlanetsDto("Jupiter", 1898187, 69911));
	dto.add(new PlanetsDto("Earth", 6371, 5972));
	Comparator<PlanetsDto>plan = Comparator.comparing(PlanetsDto::getMass);
	Collections.sort(dto,plan);
	System.out.println("After sorting");
	System.out.println(dto);
	Comparator.nullsLast(plan);
	System.out.println("--------------");
	System.out.println(dto);
}
}
