package com.xworkz.fileOperation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MobileDto {

	private String name;
	private String brand;
	private int price;
	private float weight;
}
