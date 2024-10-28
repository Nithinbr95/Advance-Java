package com.xworkz.fileOperation.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.xworkz.fileOperation.target.HospitalDto;

public class HospitalRunner {
public static void main(String[] args) {
	HospitalDto dto = new HospitalDto("Appolo Hospital", "JP Nagar", "BNG", 577345, 40, 100);
	File file = new File("HospitalDto.txt");
	System.out.println("File Type is:"+file);
	if(!file.exists()) {
		try {
			if(file.createNewFile()) {
				System.out.println("New file created");
				addObject(dto, file);
			}else {
				addObject(dto, file);
			}
		}catch(IOException e) {
			System.out.println("File is present");
		}
		Object obj = readObject(file);
		System.out.println(obj);
	}
	
}
	private static void addObject(HospitalDto dto, File file) {
		try (FileOutputStream out = new FileOutputStream(file);ObjectOutputStream in = new ObjectOutputStream(out)){
			in.writeObject(dto);
		}catch(IOException e) {
			System.out.println("File Not present");
		}
	}
	public static Object readObject(File file) {
		try(FileInputStream input = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(input)){
		  return in.readObject();
		}catch(IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return new Object();
		}
	}
}
