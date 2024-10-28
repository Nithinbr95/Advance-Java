package com.xworkz.fileOperation.target;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HospitalDto implements Serializable {

	private String h_Name;
	private String h_place;
	private String h_district;
	private int h_code;
	private int noOfDoctors;
	private int noOfNurses;
}
