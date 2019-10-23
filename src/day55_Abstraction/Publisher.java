package day55_Abstraction;

public abstract class Publisher {
	public abstract void Display();
	
	public static void main(String[] args) {
		Client1 cl1=new Client1();
		Client2 cl2=new Client2();
		Client3 cl3=new Client3();
	}

}

class Client1 extends Publisher{

	@Override
	public void Display() {
		
	}
	
}
class Client2 extends Publisher{

	@Override
	public void Display() {
		
	}
	
}
class Client3 extends Publisher{

	@Override
	public void Display() {
		
	}
	
}


