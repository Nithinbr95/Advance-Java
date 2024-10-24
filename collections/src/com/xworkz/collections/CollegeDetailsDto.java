package com.xworkz.collections.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class CollegeDetailsDto {
  private String name;
  private String university;
  public int pincode;
  private long contact; 
  private String clgcode;
}
