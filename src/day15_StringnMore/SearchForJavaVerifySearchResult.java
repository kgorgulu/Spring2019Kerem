package day15_StringnMore;

public class SearchForJavaVerifySearchResult {
	public static void main(String[] args) {
		
		//About 813,000,000 results (0.56 seconds) 
				// store above String and validate 
				// it starts with word About , and it contains word result
				
				
				String str = " About 813,000,000 results (0.56 seconds)" ; 
				
				// how to get certain part of String 
				if( str.indexOf("About") ==0 ) {
					System.out.println("it started with About");
				}else {
					System.out.println("it did not started with About");
				}
				
				if( str.indexOf("results") >= 0) {
					System.out.println("it contains results");
				}else {
					System.out.println("no results ");
					
					if( str.substring(0,5).equals("About") && str.contains("results")   ) {
						System.out.println("it pass");
					}else {
						
						
						if(  ! str.substring(0,5).equals("About") ) {
							System.out.println("about did not start in the beginning");
						}else if(! str.contains("results")) {
							System.out.println("does not contains word results");
						}
						
			System.out.println("it fails");
					
		}
					
				}
				
	}
}

				

	
