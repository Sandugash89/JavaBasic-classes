package com.syntax.class17;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double weight;
	public Dog(String dogName, String dogColor, 
			String dogBreed, int dogAge, double dogWeight) {
	name=dogName;
	color=dogColor;
	breed=dogBreed;
	age=dogAge;
	weight=dogWeight;
	System.out.println(dogName);
	printAge();
		
	}
 public void printName() {
	 System.out.println(name);
 }
 public void printBreed() {
	 System.out.println(breed);
 }
 public void printAge() {
	 System.out.println(age);
	 }
	}

