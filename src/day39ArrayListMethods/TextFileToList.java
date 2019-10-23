package day39ArrayListMethods;

import java.nio.file.*;
import java.util.*;


public class TextFileToList {

	public static void main(String[] args) {

		List<String> lineLst = getTextFileAsList("Man.txt");
	//	List<String> lineLst2 = getTextFileAsList("");
		System.out.println(lineLst);
		
		System.out.println(lineLst.size());
		// xls doc ppt pdf i want to find the following file in my computer
		
		String s= "integer.xls";
		
		// how do we just get file extension
		
				String fileExtension = s.substring(s.indexOf(".")+1);
		System.out.println(fileExtension);
		
		int count = 0;
		
		for(String each : lineLst) {
		//System.out.println(each);
		
			String fileExt = each.substring(each.indexOf(".")+1);
			if(fileExt.equals("xls")) {
				count++;
			}
		}
		System.out.println("Excel count is :" +count  );
		}
	
	
	/*
	 * DO NOT MODIFY AND JUST USE IT
	 * Method name : getTextFileAsList
	 * @parameter  location of text file as String
	 * 	if your file is at root path (right under project folder)
	 *  you may directly path your filename.txt
	 *  if not pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element

	 */
	public static List<String> getTextFileAsList(String filePath) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;

	}
}
