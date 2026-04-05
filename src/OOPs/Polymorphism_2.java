package OOPs;

// Is method overriding---

class Animal_1{
	void sound(){
		System.out.println("Animals make sound");
	}
}

class Loin extends Animal_1{
	void sound(){
		System.out.println("Loin Roar");
	}
}

public class Polymorphism_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal_1 a = new Loin();
		a.sound();

	}

}
