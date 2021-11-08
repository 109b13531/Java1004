class Cal_area
{
   int radius;
   int length;
   int width;
   int height;
   private static double pi=3.14;
   void setW(int w)  
   {
      width=w;
   }
   void setH(int h)  
   {
      height=h;
   }
   void setL(int L)  
   {
	   length=L;
   }
   void setR(int R)  
   {
	   radius=R;		
   }
   void show()
   {
      System.out.println("半徑="+radius);
      System.out.println("球形面積="+(4/3)*(radius*radius*radius));
      System.out.print("長="+length);
      System.out.print("寬="+width);
      System.out.println("高="+height);
      System.out.println("立方體面積="+length*width*6);
   }
}
public class Class03 {

	public static void main(String[] args) {
		Cal_area ca=new Cal_area();
		ca.setW(5);
	    ca.setH(6);
	    ca.setL(4);
	    ca.setR(10);
	    ca.show();
		
	}

}
