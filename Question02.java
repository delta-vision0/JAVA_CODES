import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter two double numbers: ");

        if (obj.hasNextDouble()) {
            double num1 = obj.nextDouble();

            if (obj.hasNextDouble()) {
                double num2 = obj.nextDouble();
                System.out.println("Numbers are double");
                System.out.println("The Average is :"+(num1+num2)/2);
            }
            else {
            	System.out.println("input is not Double");
            }
        }
        else {
        	System.out.println("input is not double");
        }

        obj.close();
    }
}