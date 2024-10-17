package com.xworkz.vendor.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ComplaintsDto {
 
	
	private int complaintId;
	private String productname;
	private String compliteName;
	private LocalDateTime date;
	
}
