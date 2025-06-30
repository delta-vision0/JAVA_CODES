package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	public Point2D() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X Co-ordinate : ");
		this.x = sc.nextInt();
		System.out.print("Enter Y Co-ordinate : ");
		this.y = sc.nextInt();
	}
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		return "X : " + x + ",Y : " + y + "\n";
	}
	public Boolean isEqual(Point2D obj) {
		if(this.x==obj.x && this.y == obj.y)
			return true;
		else
			return false;
	}
	public double calculateDistance(Point2D obj) {
		double xfield =  Math.pow((obj.x - this.x), 2);
		double yfield =  Math.pow((obj.y - this.y), 2);
		double dist = Math.sqrt(yfield+xfield);
		return dist;
	}
}
	

