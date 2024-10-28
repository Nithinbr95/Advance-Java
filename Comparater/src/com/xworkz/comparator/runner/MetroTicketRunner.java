package com.xworkz.comparator.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.comparator.dto.MetroTicketDto;

public class MetroTicketRunner {
public static void main(String[] args) {
	//String path = "D:\\Eclipse\\Comparator";
	MetroTicketDto dto = new MetroTicketDto("BTM", "Majestic", 30);
	File file = new File("MetroTicketDto.pdf");
	System.out.println("File is:"+file);
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

private static void addObject(MetroTicketDto dto, File file) {
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
