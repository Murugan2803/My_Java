package OOPs;

class Main {
	
	private String name;
	int rollNo;
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
	}
	
	public void setValues(String str, int num)
	{
		name = str;
		rollNo = num;
	}
	
	public String getValues() {
		return name;
	}
}
class AccesModifier{
	public static void main(String[] args) {
		
		Main ob1 = new Main();
		ob1.setValues("Sound",252);
		ob1.display();
		
		Main ob2 = new Main();
		ob2.setValues("Murugan", 231);
		String val = ob2.getValues();
		System.out.println(val+ " M");
		ob2.display();
		
	}
}
