package tester;
import com.app.geometry.Point2D;
public class TestPoint {
	public static void main(String[] args) {
		Point2D p1 =new Point2D();
		System.out.print(p1.getDetails());
		Point2D p2 =new Point2D();
		System.out.print(p2.getDetails());
		if(p1.isEqual(p2)) {
			System.out.println("p1 & p2 are located at the same position");
		}
		else {
			System.out.printf("The Distance Between P1 & P2 is : %.2f",p1.calculateDistance(p2));
		}
	}

}
