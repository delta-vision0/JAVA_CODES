
public class Fibonaccii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		int c;
		int i;
		
		for(i=0 ; i<10 ; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
