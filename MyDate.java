package com.vision;

import java.util.Scanner;

public class MyDate {
private int day;
private int month;
private int year;
Scanner sc = new Scanner(System.in);
public MyDate() {
	this(01,01,1976);
}
public MyDate(int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}
public MyDate acceptDate() {
	System.out.println("Enter Day :");
	this.day = sc.nextInt();
	System.out.println("Enter Month :");
	this.month = sc.nextInt();
	System.out.println("Enter Year :");
	this.year = sc.nextInt();
	return new MyDate(this.day,this.month,this.year);
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

public String toString() {
	return day+"-"+month+"-"+year;
}
}
