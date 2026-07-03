package OOPs;

abstract class Computer{
	
	abstract void turnOff();
	
	void turnOn() {
		System.out.println("Turning On");
	}
}

class HP extends Computer{
	
	void turnOn() {
		System.out.println("Turning On");
	}
	
	void turnOff() {
		System.out.println("Turning Off - HP");
	}
}

class Dell extends Computer{
	
	void turnOff() {
		System.out.println("Turning Off - Dell");
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HP ob = new HP();
		ob.turnOn();
		ob.turnOff();
		
		Dell ob1 = new Dell();
		ob1.turnOn();
		ob1.turnOff();
		

	}

}
