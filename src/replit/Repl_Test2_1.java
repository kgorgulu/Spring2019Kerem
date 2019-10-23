package replit;

public class Repl_Test2_1 {
	 public class Accumulator{
		  int sum;
		  
		  public Accumulator(int sum){
		    this.sum=sum;
		  }
		  public int getSum() {
				return sum;
			}
		  public void add(int a){
		    sum=sum+a;
		  }
		  public void remove(int b){
		    sum=sum-b;
		  }
		  
		  public String toString(){
		    return "Sum is: "+sum;
		  }
		}
		}

