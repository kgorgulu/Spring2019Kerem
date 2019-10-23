package day45_Constructors;

public class CubeClass {
	public static void main(String[] args) {
		
		Cube cube1 = new Cube();   // Cube() constructor of Cube class
		
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2= new Cube(4,6,8);
		System.out.println(cube2.getCubeVolume());
	}
}
