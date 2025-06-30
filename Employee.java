import java.util.Scanner;
public class Employee {
	private String Name;
	private int Empid;
	private double Salary;
	
	//constructor-prameterless
	public Employee() {
		System.out.println("Employee()");
		Name="Haris";
		Empid=123456;
		Salary=50000;//constructor chaining
	}
	//parameterized constructor
	public Employee(String Name,int Empid,double Salary) {
		System.out.println("Employee(String Name,int Empid,double Salary)");
		this.Name=Name;
		this.Empid=Empid;
		this.Salary=Salary;
	}
	//setter
	public void setName() {
		System.out.print("Enter Name : ");
		Scanner sc = new Scanner(System.in);
		this.Name=sc.nextLine();
	}
	public void setEmpid() {
		System.out.print("Enter Employee ID : ");
		Scanner sc = new Scanner(System.in);
		this.Empid=sc.nextInt();
	}
	public void setSalary() {
		System.out.print("Enter Salary : ");
		Scanner sc = new Scanner(System.in);
		this.Salary=sc.nextDouble();
	}
	
	//getter
	public void printRecord() {
		System.out.println("Employee Name : "+Name);
		System.out.println("Employee ID : "+Empid);
		System.out.println("Employee Salary : "+Salary);
	}
	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.printRecord();
		emp1.setName();
		emp1.setEmpid();
		emp1.setSalary();
		emp1.printRecord();

	}

}
