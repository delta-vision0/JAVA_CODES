package com.vision;
import java.util.Scanner;

public class CreditLimitCalculator {
	private int accNo;
	private int initBal;
	private int items;
	private int credits;
	private int limit;
	Scanner sc = new Scanner(System.in);
	public CreditLimitCalculator() {
		this(0,0,0,0,0);
	}
	
	public CreditLimitCalculator(int accNo, int initBal, int items, int credits, int limit) {
		this.accNo = accNo;
		this.initBal = initBal;
		this.items = items;
		this.credits = credits;
		this.limit = limit;

	}
	public void acceptDetails() {
		System.out.println("Enter Account NO : ");
		this.accNo = sc.nextInt();
		System.out.println("Enter Openeing Balance of This Month : ");
		this.initBal = sc.nextInt();
		System.out.println("Enter total of all items charged by the customer this month : ");
		this.items = sc.nextInt();
		System.out.println("Enter total of all credits applied to the customer’s account this ");
		this.credits = sc.nextInt();
		System.out.println("Enter Allowed Credit Limit per Month :");
		this.limit= sc.nextInt();
	}
	
	public void printDetails() {
		System.out.println("Account NO : "+this.accNo);
		System.out.println("Openeing Balance of This Month : "+this.initBal);
		System.out.println("total of all items charged by the customer this month : "+this.items);
		System.out.println("total of all credits applied to the customer’s account this "+this.credits);
		System.out.println("Allowed Credit Limit per Month :"+this.limit);
		System.out.println("New Balance : "+this.Calculate());
		this.getCreditStatus();

	}
	public void getCreditStatus() {
		if(this.Calculate()>this.limit) {
			System.out.println("Credit Limit Exceeded !!!");
		}
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getInitBal() {
		return initBal;
	}
	public void setInitBal(int initBal) {
		this.initBal = initBal;
	}
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public double Calculate() {
		double Balance=(this.initBal+this.items)-this.credits;
		//double newBalance = this.limit-Balance;
		return Balance;
	}
}
