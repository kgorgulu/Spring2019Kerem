package day45_Constructors;


public class Cube {
	
	int length;
	int width;
	int height;
	
	public int getCubeVolume() {
		return(length*width*height);
		
	}
	Cube(){   // no return value for the constructor	
		length = 10;
		width = 20;
		height = 30;
		
		System.out.println("We are in Constructors");
		
	}
	Cube(int l, int w, int h){   //constructor overload with parameters
		length = l;
		width = w;
		height = h;
		
		System.out.println("We are in Constructors");
		
	}
	
}
