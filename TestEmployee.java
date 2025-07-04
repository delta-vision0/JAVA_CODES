package tester;
import java.util.Arrays;
import java.util.Scanner;
import com.vision.*;
public class TestEmployee{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees(MAX:10) :");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		int choice=1;
		int i=0;
//		emp[i++] = new Employee(101, "IT", 96525, new MyDate(1, 1, 2020));
//		emp[i++] = new Employee(102, "HR", 50000, new MyDate(2, 2, 2021));
//		emp[i++] = new Employee(103, "AI", 75000, new MyDate(3, 3, 2022));
		while(choice!=7) {
			System.out.println("\n1.Add Employee");
			System.out.println("2.Display All Employees:");
			System.out.println("3.Search Employee by ID:");
			System.out.println("4.Display Employees joined in given Year:");
			System.out.println("5.Find Employee with Maximum Salary:");
			System.out.println("6.Find Employee with Minimum Salary");
			System.out.println("7.EXIT The Application :");
			System.out.print("\nEnter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1 :
					if(i < emp.length)
					{
						emp[i]= new Employee();
						emp[i].acceptData();
						i++;
					}
					else {
						System.out.println("Maximum Number Of Employee's Reached.");
					}
					break;
				
				case 2 :
					System.out.println("\n---EMPLOYEE DETAILS---\n");
					for(int j = 0; j < i; j++) {
					    System.out.println("--Employee " + j + "--");
					    System.out.println(emp[j].toString());
					}


					break;
				case 3 : 
					System.out.println("Enter Emplyee ID :");
					int empid = sc.nextInt();
					int flag=0;
					for(int j = 0; j < i; j++) {
					    if(emp[j].getId() == empid) {
					        System.out.println(emp[j]);
					        flag = 1;
					        break;
					    }
					}
					if(flag==0) {
						System.out.println("Employee Not Found");
					}
					break;
				case 4 :
					System.out.println("Enter Joining Year :");
					int join = sc.nextInt();
					flag=0;
					for(int j = 0; j < i; j++)  {
						if(emp[j].getDateOfJoining().getYear()==join) {
							System.out.println(emp[j].toString());
							flag=1;
						}
					}
					if(flag==0) {
						System.out.println("Employee Not Found");
					}
					break;
				case 5:
					Arrays.sort(emp);
					System.out.println("Employee With Maximum Salary ");
					System.out.println(emp[emp.length-1].toString());
					break;
					
				case 6:
					Arrays.sort(emp);
					System.out.println("Employee With Minimum Salary ");
					System.out.println(emp[0].toString());
					break;
				
				case 7:
					System.out.println("Exiting...");
					return;
					
				default:
	                System.out.println("Invalid input. Try again."); 
				}
				
					
		}
	sc.close();}

}
