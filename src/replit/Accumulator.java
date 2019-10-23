package replit;

import java.util.ArrayList;

	
public class Accumulator{
	  int sum;
		
		public Accumulator(int sum) {
			
			this.sum = sum;
		}
		public int getSum() {
			return this.sum;
		}
		
		public void add(int num) {
			this.sum += num;
		}
		
		public void remove(int num) {
			this.sum -= num;
		}
		
		@Override
		public String toString() {
				// TODO Auto-generated method stub
			return "Sum is: " + this.sum;
			
	}
}
