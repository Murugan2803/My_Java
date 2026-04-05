package OOPs;

class Class_object {
	String name;
	int roll;
	
	public void display()
	{
		System.out.println(name);
		System.out.println(roll);
		
	}
	public static void main(String[] args) {
		Class_object ob =new Class_object();
		ob.name="Soundarya";
		ob.roll=231;
		ob.display();
	}
}
