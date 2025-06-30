package com.assignment;
import java.util.Scanner;
public class Invoice {
	private String partnumber;
	private String description;
	private int quantity;
	private double price;
	public Invoice() {
		this("abc000","null",0,0);
	}
	public Invoice(String partnumber, String description, int quantity, double price) {
		this.partnumber = partnumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	//getter & setter
	public String getPartnumber() {
		return partnumber;
	}
	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity=0;
		}
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0) {
			this.price=0;
		}
		this.price = price;
	}
	
	public double invoiceAmount() {
		return this.quantity*this.price;
	}
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Part Number : ");
		this.partnumber = sc.nextLine();
		System.out.print("Enter Description : ");
		this.description = sc.nextLine();
		System.out.print("Enter Quantity : ");
		this.quantity = sc.nextInt();
		System.out.print("Enter Price : ");
		this.price = sc.nextDouble();
		sc.close();
	}
	public void displayData() {
		System.out.println("Part Number : "+this.partnumber);
		System.out.println("Description : "+this.description);
		System.out.println("Quantity : "+this.quantity);
		System.out.println("Price : "+this.price);
		System.out.println("Total Invoice Amount : "+invoiceAmount());
	}
}
class InvoiceTest{
	public static void main(String[] args) {
		Invoice i1 = new Invoice();
		i1.setData();
		i1.displayData();
	}
}
