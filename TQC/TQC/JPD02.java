import java.util.*;
public class JPD02 {

	public static void main(String[] args) {
		System.out.println("Pleaasse enter score:");
		Scanner a  = new Scanner(System.in);
		int b = a.nextInt();
		if(b>=60) {
			System.out.print("You pass");
		}
		else {
			System.out.print("End");
		}
	}

}
