package com.xworkz.comparator.dto;

import java.util.Comparator;

public class PriceImpl implements Comparator<GadgetDto> {

	@Override
	public int compare(GadgetDto o1, GadgetDto o2) {
		
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}

}
