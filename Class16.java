package homework;
class CSphere 
{
	private int x;
	private int y;
	private int z;
	private int radius;
void setLocation(int a,int b,int c) //a
{
	x = a;		//a
	y = b;		//a
	z = c;		//a		
}
void setRadius(int r) {		//b
	radius = r;				//b
}
double surfaceArea() {
return  4*3.14*radius*radius*radius;
}
double volume() {
return ((double)(3.0/4)*3.14*radius*radius*radius);
}
void showCenter() {
System.out.println("x = "+x+" , y = "+y+" , z = "+z);
}
}
public class Class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere a = new CSphere();
		a.setLocation(3, 4, 5);
		a.setRadius(1);
		a.showCenter();
		System.out.println("surfacearea = "+a.surfaceArea());
		System.out.println("volume = "+a.volume());
	}

}
