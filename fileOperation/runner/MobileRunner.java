package com.xworkz.fileOperation.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.xworkz.fileOperation.dto.MobileDto;

public class MobileRunner {
public static void main(String[] args) {
	MobileDto dto = new MobileDto();
	dto.setName("RealMEC21");
	dto.setBrand("RealMe");
	dto.setPrice(10000);
	dto.setWeight(20f);
	MobileDto dto1 = new MobileDto();
	dto1.setName("Vivo Y21");
	dto1.setBrand("Vivo");
	dto1.setPrice(20000);
	dto1.setWeight(24f);
	List<MobileDto>list = new ArrayList();
	list.add(dto);
	list.add(dto1);
    list.stream().distinct().forEach(s->System.out.println(s));
}
}
