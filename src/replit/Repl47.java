package replit;
import java.util.Scanner;


public class Repl47 {
	public static void main(String[] args) {
						  
		    /*
		     *     STATUS CODES

    200, OK
    201, Created
    202, Accepted
    301, Moved Permanently
    303, See Other
    304, Not Modified
    307, Temporary Redirect
    400, Bad Request
    401, Unauthorized
    403, Forbidden
    404, Not Found
    410, Gone
    500, Internal Server Error
    503, Service Unavailable


Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"
		     */
		 int status;
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter status code:");
		    
		    status = scan.nextInt();
		    String label = "unknown";
		    
		    switch(status) {
		    case 200:
		    	label="OK";
		    
		    break;
		    
		
			case 201:
	    	label="Created";

	    	break;
	    	
	    	case 202:
	    	label="Accepted";
	    
	    	break;
		    
	    	case 301:
		    	label="Moved Permanently";

		    	break;
	
	    	case 303:
		    	label="See Other";
	
		    	break;
		
	    	case 304:
		    	label="Not Modified";
		    	System.out.println(label); 
		    	break;
	
	    	case 307:
		    	label="Temporary Redirect";

			    break;
		
	    	case 400:
		    	label="Bad Request";
	
			    break;
			
		    case 401:
		    	label="Unauthorized";
		  
			    break;
		
		    case 403:
		    	label="Forbidden";
		    
			    break;
		
		    case 404:
		    	label="Not Found";
		 
			    break;
			   
		    case 410:
		    	label="Gone";
		   
			    break;
			
		    case 500:
		    	label="Internal Server Error";
		    
			    break;
			 
		    case 503:
		    	label="Service Unavailable"; 
		    		    	
			    break;
		    	 		    	
			    default :
			    label="Invalid status code!";
			    break;
		    }
			    	System.out.println(label); 
			    
		    }
	}
		    
	


