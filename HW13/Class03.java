
public class Class03 {

	public static void main(String[] args) {
		try {
			int num = 12,den = 0;
			int ans = num/den ;
			System.out.print("ans = "+ ans);
		}
		catch(Exception e) {
			System.out.println("°£¼Æ¬°0");		
		}
		finally {
			System.out.println("end of main() method!!");
		}
	}
}