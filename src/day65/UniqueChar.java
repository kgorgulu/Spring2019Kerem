package day65;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {
	public static void main(String[] args) {
		
		String str = "ABCABCEFGADBHYKJSGD"; 
    	char [] ch=str.toCharArray();
    	Set<Character> unique1=new HashSet<>();
    	for (int i = 0; i < ch.length; i++) {
    		unique1.add(ch[i]);
		}
    	System.out.println(unique1);

	}
}
