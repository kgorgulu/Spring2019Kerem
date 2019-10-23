package day58_Interface;

public class Interface_Notes {
	public static void main(String[] args) {

		/*
		 * 2 way to achieve abstraction in java 
  abstract class 
  interface 
  interface 
    constant -->> public static final field 
    abstract method -->> 
    /// till java 8 -->> an interface could only have above members
    default method 
      it is declared using default keyword and it has body 
      It makes easier to add new functionality into intercace without breaking existing functionalities
    static method 
      it's mostly used as utility method that not attatched any object 
      We can only access static method of interface 
      using static way  -->> InterfaceName.staticMethod() 
      IT'S NOT INHERITED 
      NO FINAL METHDO INTERFACE 
    By default , access modifier for interface members are 
      ALL PUBLIC 
  any fields are autimatically public static final 
  any method without a body --automatically public abstract 
  How many interface a class can implemnet -->> NO LIMIT 
    public class Student implement Teachable, Hirable, Offerable {}
  CAN a interface extends anotehr interface -->> YES , ONE OR MORE 
    public interface Mammal extends Animal, Pet, OtherInterfaces{
    } 
    the purpose is to reuse the methods that exists in interface   that being extended 
  Abstract class 
    it is declared using abstract keyword 
    public abstract class Student{
    }
    it can not be instantiated -->> NO OBJECT 
    it may contain abstract method 
    fields --->>
      instance + static 
      final + non-final 
      private , protected , default , public  
    constructor -->>
      any constructor it can have like normal class 
    methods -->> 
      it can have abstract method 
      it can have non-abstratc method 
      instance + static 
      it can have final method
        public abstract class School{
          public abstract void teach();  
          // this method is here just to be inherited as is
          public final void obeyTheRule(){
            // must obey the rul 
          }
        }
        public class CodingSchool extends School{
          public void teach(){
            // teach coding 
          }  
        }
    blocks -->> 
      instance + static block 
    How many class a class can extend -->>> ONLY 1 !!!!!
  can a abstract class implements a interface 
    
    public interface Pet{
      public abstract void feedPet(); 
    }
    would this code compile ? 
    
    public abstract class Cat implements Pet{
      //public abstract void feedPet(); 
    }  
    public class SpartanCat extends Cat{
      public void feedPet(){
        //feed your cat with milk 
      } 
    }
    
    
    Task 2 
    
    
    Create an interface called Drawable 
      with below members
      
        constant DRAWING_TOOL  
        abstract method draw 
        
        default method drawLine  accept one int as line count and print drawing n line 
        
        static method printDrawingTool accept no arg and return nothing 
        
    
    Abstract class called Shape , implements Drawable 
      it has instance fields 
        color 
        
      it has abstract method calculateArea 
      it has abstract method toString 
      
    
    Create a concrete Shape class called -- Triangle 
    
      it has height , base   -->> formula to calculate area base * height / 2 
      it has constructor to set all the values 
      
      create a constructor to set all the value 
      
      override all the abstract method that you inherited
      
    
    Optionally create Square -- sub class of Shape 
      it has sizeLength 
      
      create a constructor to set all the fields 
      implemenet all the unimplemented methods 
      
      
      Eventually in main method create few objects and call their methods 
		 */
	}
}
