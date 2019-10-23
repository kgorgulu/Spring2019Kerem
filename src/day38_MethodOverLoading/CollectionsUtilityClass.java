package day38_MethodOverLoading;

import java.util.*;




public class CollectionsUtilityClass {
	public static void main(String[] args) {


				// collection utility class
				// have many static methods perform common array operations
				// Arrays.sort(ArrayObject);

				// Collections is a class under java.util package performs collection operations

				ArrayList<String> list = new ArrayList<String>();

				list.add("Snail");
				list.add("Termite");
				list.add("Fly");
				list.add("Tiger");
				list.add("Starling");
				list.add("Ecoli");
				System.out.println("Before: " + list);
				Collections.sort(list);

				System.out.println("After: " + list);
	}
}
