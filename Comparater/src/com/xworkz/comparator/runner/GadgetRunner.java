package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.dto.BatteryLifeImpl;
import com.xworkz.comparator.dto.GadgetDto;
import com.xworkz.comparator.dto.PriceImpl;

public class GadgetRunner {

	public static void main(String[] args) {
		List<GadgetDto>list = new ArrayList<GadgetDto>();
		list.add(new GadgetDto("Vivo", 9, 20000));
		list.add(new GadgetDto("Realme", 02, 25000));
		list.add(new GadgetDto("Poco", 10, 39000));
		list.add(new GadgetDto("IPhone", 12, 150000));
		Collections.sort(list,new PriceImpl());
		System.out.println("Price from lowest to Highest");
		System.out.println(list);
		System.out.println("BatteryLife from Highest to Lowest");
		Collections.sort(list, new BatteryLifeImpl());
		System.out.println(list);
		Comparator<GadgetDto>brand = Comparator.comparing(GadgetDto::getBatteryLife);
		Comparator<GadgetDto>gad = Comparator.comparing(GadgetDto::getPrice);
		Comparator<GadgetDto>gadget = brand.thenComparing(gad);
		Collections.sort(list,gadget);
		System.out.println("After Comparing");
		System.out.println(list);
	}

}
