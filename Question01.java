import java.util.Scanner;
public class Question01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scan Info
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		
		//Show Info
		System.out.println("Given Number : "+num);
		System.out.println("Binary Equivalent : "+ Integer.toBinaryString(num));
		System.out.println("Octal Equivalent : "+ Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent : "+ Integer.toHexString(num));
		sc.close();
	}
}
 