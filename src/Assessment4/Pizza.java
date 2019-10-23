package Assessment4;

public class Pizza {
	
		private String size;
		private int topC;
		private int topP;
		private int topH;

		// new Pizza("medium", 2, 0 , 0)
		public Pizza(String size, int topC, int topP, int topH) {
			this.size = size;
			this.topC = topC;
			this.topP = topP;
			this.topH = topH;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public int getTopC() {
			return topC;
		}

		public void setTopC(int topC) {
			this.topC = topC;
		}

		public int getTopP() {
			return topP;
		}

		public void setTopP(int topP) {
			this.topP = topP;
		}

		public int getTopH() {
			return topH;
		}

		public void setTopH(int topH) {
			this.topH = topH;
		}

		public double calcCost() {
			double price = 0;
			int toppings = topC + topP + topH;

			if (size.equalsIgnoreCase("small")) {
				price += 10;
			}
			if (size.equalsIgnoreCase("medium")) {
				price += 12;
			}
			if (size.equalsIgnoreCase("large")) {
				price += 14;
			}

			price += (toppings * 2);

			return price;
		}

		public String getDescription() {

			String output = size + " Pizza with " + topC + " Cheese toppings, " + topP + " Pepperoni toppings, and " + topH
					+ " Ham toppings.\n Total Price: " + calcCost();

			return output;

		}
	}