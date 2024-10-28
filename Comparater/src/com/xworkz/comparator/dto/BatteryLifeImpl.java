package com.xworkz.comparator.dto;

import java.util.Comparator;

public class BatteryLifeImpl implements Comparator<GadgetDto> {

	@Override
	public int compare(GadgetDto o1, GadgetDto o2) {
		
		return Integer.compare(o2.getBatteryLife(), o1.getBatteryLife());
	}

}
