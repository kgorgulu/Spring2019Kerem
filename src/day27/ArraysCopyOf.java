package day27;

import java.util.Arrays;

public class ArraysCopyOf {
	public static void main(String[] args) {
		
		String[] heroes = {"Superman", "Batman", "Aquaman", "Wonder Woman", "The Flas", "Green Lantern"};
		
		String [] heroesCopied= new String[heroes.length];
		
		for (int i = 0; i < heroesCopied.length; i++) {
			heroesCopied[i] = heroes[i];
			
			System.out.println(Arrays.toString(heroesCopied));
		}
		/*
		Arrays.sort(heroes);
		
		System.out.println(Arrays.toString(heroes));
		
		for (String str : heroes) {

			System.out.println(str+",");
		*/	
		Arrays.sort(heroesCopied);
		
		System.out.println(Arrays.toString(heroes));
		System.out.println(Arrays.toString(heroesCopied));
			
			}
	}
