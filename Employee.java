package com.vision;

public class Employee extends Person implements Comparable <Employee> {
	private int id;
	private String department;
	private double salary;
	private MyDate dateOfJoining = new MyDate();
	
	public Employee() {
		this(0,"null",0,new MyDate());
	}
	
	public Employee(int id, String department, double salary, MyDate dateOfJoining) {
	    //super("HarisDesai", new MyDate(1, 1, 2000));
	    this.id = id;
	    this.department = department;
	    this.salary = salary;
	    this.dateOfJoining = dateOfJoining;
	}

	
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter ID : ");
		this.id = sc.nextInt();
		System.out.print("Enter Department :");
		this.department = sc.next();
		System.out.println("Enter Salary : ");
		this.salary = sc.nextDouble();
		System.out.println("Enter Date Of Joining : ");
		this.dateOfJoining = dateOfJoining.acceptDate();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(MyDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "\nEmployee "+super.toString()+"\nEmployee_id : " + id + "\nDepartment : " + department + "\nSalary : " + salary + "\nDate_Of_Joining : "
				+ dateOfJoining;
	}

	@Override
	public int compareTo(Employee o) {
		 if(this.getSalary() > o.getSalary())
	            return 1;
	        else if (this.getSalary() == o.getSalary())
	            return 0 ;
	        return -1 ;
	}
	

	
	
	
}
