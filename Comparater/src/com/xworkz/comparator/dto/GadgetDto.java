package com.xworkz.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GadgetDto {
  private String brand;
  private int batteryLife;
  private int price;
}
