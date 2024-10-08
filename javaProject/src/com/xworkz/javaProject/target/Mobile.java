package com.xworkz.javaProject.target;

public class Mobile {

	int index = 0;
	String name[] = new String[4];

	public int arrayLength() {
		return name.length;
	}

	public String onSave(String brand) {
		System.out.println("Brand name is:" + brand);
		if (index < arrayLength()) {
			name[index] = brand;
			index++;
		}
		return "Saved successfully";
	}

	public void readArray() {
		for (int i = 0; i < arrayLength(); i++) {
			System.out.println("Brand is:" + name[i]);
		}
	}

	public void update(String oldbrand, String newbrand) {
		for (int i = 0; i < arrayLength(); i++) {
			if (name[i] == oldbrand) {
				name[i] = newbrand;
				System.out.println("updated successfully");
			} else {
				System.out.println("not updated");
			}
		}

	}

	public void delete(String brand) {
		for (int j = 0; j < arrayLength(); j++) {
			if (name[j].equalsIgnoreCase(brand)) {
				name[j] = null;
				System.out.println(name[j]);
				System.out.println("deleted successfully");
			}else {
			System.out.println("not deleted");
			}
		}
	}
}
