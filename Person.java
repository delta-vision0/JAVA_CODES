package com.vision;

import java.util.Scanner;

public class Person{
	private String name;
	private MyDate dateOfBirth = new MyDate();
	Scanner sc = new Scanner(System.in);
	public Person() {
		this(null,new MyDate());
	}
	public Person(String name, MyDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	
	public void acceptData() {
		System.out.print("Enter Name : ");
		this.name = sc.nextLine();
		System.out.println("Enter Date Of Birth :");
		this.dateOfBirth = dateOfBirth.acceptDate();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Name : "+name+"\nDate Of Birth : "+dateOfBirth;
	}
}
