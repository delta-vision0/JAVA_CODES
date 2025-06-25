
public class PatternCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=n ; i>=0 ; i--) {
			for(int j=n ; j>i ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
