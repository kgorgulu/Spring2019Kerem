package day43_Encapsulation_Review;

public class AccessModifier {
	public static void main(String[] args) {
		
		/*
		 * // 4 access modifier to define access level of fields of methods 
public      --- accessible anywhere
protected   -- stay tuned for later
default(no) -- package private 
private     -- in same class only 

Good Encapsulation practice 
making instance fields private 
and providing public getter/setter for the filed for access and modify 

getter -->> a method for getting the value of your field and the name is specifically recomended in getFieldName() format  and return the value of field

setter -->> a method for setting the value of your field and the name specically sugested to have 
setFieldName(dataType fieldName) and it will set new value for the field and it does not return value 



Create a class called Vehicle 
with few private fields model , make , speed 
create getters and setters for all those private fields 

create methods : 
	increaseSpeed : it accepts one parameter increaseBy as int 
	and increase the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->

	decreaseSpeed  : 
	it accepts one parameter decreaseBy as int 
	and decrease the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
	this keyword : 
	is used to address the current object that being worked on 
	we can use it to address the instance field of the class 
		this.fieldName 
	we can also use it to address the instance method of the class 


Customer should be able to view 
Product detail 

noun -->> you can think of a class

Customer 
	name, password,primemeber
	viewProduct() browse()

Product 
  name, rating, price , item
		 */

	}
}
