package homework;

class CBox{int length,width,height;
int volume() {						//b
	return length*width*height;		//b
}
int surfaceArea() {
	return ((length*width)+(width*height)+(height*length))*2;	//c
}
void showData() {
	System.out.println("length ="+length);		//d
	System.out.println("width ="+width);		//d
	System.out.println("heigh ="+height);		//d
}
void showAll(){
	showData();												//e
	System.out.println("volume ="+volume());				//e
	System.out.println("surfaceArea ="+surfaceArea());		//e
}


}


public class Class05 {

	public static void main(String[] args) {
		CBox box;
		box = new CBox();
		box.length = 20;
		box.width = 5;
		box.height = 2;
		box.showAll();
	}

}
