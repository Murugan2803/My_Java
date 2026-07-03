package OOPs;

class Animal{
	int leg = 4;
	
	public  static void eat() {
		System.out.println("I'm eating ");
	}
	
	public static void walk() {
		System.out.println("I'm walking ");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("I can bark");
	}
}
public class Inheritance {

	public static void main(String[] args) { 
		
		Dog  obj = new Dog();
		System.out.println(obj.leg);
		obj.eat();
		obj.walk();
		obj.bark();

	}

}
