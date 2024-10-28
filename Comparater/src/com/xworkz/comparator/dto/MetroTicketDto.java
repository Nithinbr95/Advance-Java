package com.xworkz.comparator.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MetroTicketDto implements Serializable {

	private String from;
	private String to;
	private int price;
}
