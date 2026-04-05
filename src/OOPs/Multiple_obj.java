package OOPs;

public class Multiple_obj {
	
	String name;
	int rollNo;
	
	public  void display() {
		System.out.println(name);
		System.out.println(rollNo);
	}
	public void setValues(String str, int num) { 
		name = str;
		rollNo = num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_obj ob1 = new Multiple_obj();
		ob1.setValues("Soundarya", 252);
		ob1.display();
		
		Multiple_obj ob2 = new Multiple_obj();
		ob2.name = "Murugan";
		ob2.rollNo = 231;
		ob2.display();
	}

}
