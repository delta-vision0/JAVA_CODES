package com.assignment;

import java.util.Scanner;

/*Q1. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTe       st that demonstrates class Date’s capabilities.*/
public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(){
		this(1,1,2000);
	}
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.printf("Date : %d/%d/%d",this.day,this.month,this.year);
	}
	public void setDate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Day : ");
		this.day = sc.nextInt();
		System.out.print("Enter Month : ");
		this.month = sc.nextInt();
		System.out.print("Enter Year : ");
		this.year = sc.nextInt();
		sc.close();
	}
	
}

