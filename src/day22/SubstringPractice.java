package day22;

public class SubstringPractice {
	public static void main(String[] args) {
				//	   01234567890123456789012346   ----> location of the char.
		String song = "Name : Ba Ba Black Sheep Ba ";
		
		//lets find all the ba s
		
		String target = "Ba";
		int indexOf1Ba =song.indexOf("Ba");
			System.out.println(indexOf1Ba);
				
			//indexOf(string, beginningIndex)
			
			int indexOf2Ba = song.indexOf("Ba" , indexOf1Ba + 2);
			System.out.println(indexOf2Ba);
			
			int indexOf3Ba = song.indexOf("Ba" , indexOf2Ba + 2);
			System.out.println(indexOf3Ba);
			
	}
}
