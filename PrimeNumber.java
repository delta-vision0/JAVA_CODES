
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 27;
		boolean isprime = true;
		for (int i = 2; i < number; i++) { 
            if (number % i == 0) {
                isprime = false;
            }
        }
		
		if(isprime) {
			System.out.println("Number is Prime");
		}
		
		else {
			System.out.println("Number is not Prime");
		}
	}

}