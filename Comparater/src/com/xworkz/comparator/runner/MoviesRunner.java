package com.xworkz.comparator.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparator.dto.GadgetDto;
import com.xworkz.comparator.dto.MoviesDto;

public class MoviesRunner {

	public static void main(String[] args) {
		List<MoviesDto>dto =new ArrayList<MoviesDto>();
		dto.add(new MoviesDto("KGF 1", 2018, 9.5f));
		dto.add(new MoviesDto("KGF 2", 2020, 10.0f));
		dto.add(new MoviesDto("Bhemma", 2024, 6.5f));
		Comparator<MoviesDto>com = new Comparator<MoviesDto>() {

			@Override
			public int compare(MoviesDto o1, MoviesDto o2) {
				
				return Float.compare(o1.getRating(), o2.getRating());
				
			}
		
		};
		Collections.sort(dto,com);
		System.out.println("Ascending order by Rating");
		System.out.println(dto);
		Comparator<MoviesDto>comp = new Comparator<MoviesDto>() {

			@Override
			public int compare(MoviesDto o1, MoviesDto o2) {
			
				return Integer.compare(o2.getYear(), o1.getYear());
			}
		};
		Collections.sort(dto,comp);
		System.out.println("Decending order by Year");
		System.out.println(dto);
		Comparator<MoviesDto>brand = Comparator.comparing(MoviesDto::getRating);
		Comparator<MoviesDto>gad = Comparator.comparing(MoviesDto::getYear);
		Collections.sort(dto,gad);
		System.out.println("After Comparing");
		System.out.println(dto);
	}

}
