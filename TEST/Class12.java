package homework;

class CWin{
	int width,height;
	String name;
	void setW(int w) {		//(a
		width = w;
	}
	void setH(int h) {		//(a
		height = h;
	}
	void setName(String s) {		
		name = s;
	}
	void show() {				//output
		System.out.println("Name="+this.name);
		System.out.println("W=="+this.width+",H="+this.height);
	}
	void setwindows(int w,int h) {		//b
		this.width = w;
		this.height = h;
	}
	void setwindows(int w,int h,String s) {		
		this.width = w;
		this.height = h;
		this.name = s;
	}
}

public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin cw =new CWin();
		cw.setName("1st windows");
		cw.setW(5);
		cw.setW(3);
		cw.show();
	}

}
