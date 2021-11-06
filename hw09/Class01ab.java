class CRectangle {
	int width;
	int height;

	public CRectangle(int w, int h) {		//a
		width = w;
		height = h;
		System.out.println("constructor CRectangle(int w,int h) called");
	}

	public CRectangle() {		//b
		width = 10;	
		height = 8;
		System.out.println("constructor CRectangle() called");

	}

	public void show() {
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}
}

public class Class01ab {
	public static void main(String args[]) {
		CRectangle rec1 = new CRectangle(5, 2);
		rec1.show();
		CRectangle rec2 = new CRectangle();
		rec2.show();
	}
}
