package day50.diffPackage;

import day50_InheritanceSuperClass.Vehicle;

public class Airplane extends Vehicle{

	  private int wingCount;
	  
	  

	  public Airplane(String brand, String model, int year, int wingCount) {
	    
	    super(brand, model, year);
	  
	    this.wingCount=wingCount;
	  }
	  
	  public int getWingCount() {
	    return wingCount;
	  }

	  public void setWingCount(int wingCount) {
	    this.wingCount = wingCount;
	  }

	  @Override
	  public String toString() {
	    return "Airplane [wingCount=" + wingCount + ", year=" + year + ", getWingCount()=" + getWingCount()
	        + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", toString()=" + super.toString()
	        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	  }

	  public static void main (String[] args) {
	    
	    Airplane a1= new Airplane("boeing ", "737", 2020. 4);
	  }
	}

	  
	  /*
	   *   public String getBrand() {
	    return brand;
	  }
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  public String getModel() {
	    return model;
	  }
	  public void setModel(String model) {
	    this.model = model;
	  } 
	   * 
	   * */


