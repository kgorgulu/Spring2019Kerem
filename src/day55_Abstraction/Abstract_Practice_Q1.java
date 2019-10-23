package day55_Abstraction;


public class Abstract_Practice_Q1 {

    public static void main(String[] args) {


        Client1 cl1 = new Client1();
       // System.out.println(cl1);
        cl1.Display();
        Client2 cl2 = new Client2();
        cl2.Display();
        Client3 cl3 = new Client3();
        cl3.Display();
    }
}

/*-------------------------------------------------------------------------------------------------------*/
// You are a publisher company and you have displays in different locations.
// You have a frame( Display method) every single customer can create their own message

// Step -1 : Create parent class  and name it as Publisher with an an abstract Method which is Display
// Step -2 : Create 3 concrete clients/customer classes and implement the Display method
// Step -3 : Create an object for the client classes and call them;

/*-------------------------------------------------------------------------------------------------------*/

abstract class Publisher {
    public abstract void Display();

    public static void main(String[] args) {

    }

}

class Client1 extends Publisher {

    @Override
    public void Display() {
        System.out.println(" The best Deaaler of Toyota");
    }

}

class Client2 extends Publisher {

    @Override
    public void Display() {
        System.out.println("The best Cleaning Company, We serve to homes and busines centers");
    }

}

class Client3 extends Publisher {

    @Override
    public void Display() {
        System.out.println("We are having closing sales");
	}
}
