package homework;
class CTest{
	void test(int a) {
		System.out.println("a = "+a);
		if(a%2==1)
			System.out.println("此為奇數");
		else if (a==0)
			System.out.println("此為0");
		else
			System.out.println("此為偶數");
	}
}
public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CTest x =new CTest();
x.test(12);
x.test(70);
x.test(57);
x.test(61);
x.test(0);
	}

}
