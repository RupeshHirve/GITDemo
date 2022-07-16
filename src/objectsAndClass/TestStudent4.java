package objectsAndClass;

class Student4{
	
	int id;
	String name;
	
	void InsertRecord(int i, String r) {
		id=i;
		name=r;
	}

	public void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println(id+" "+name);
	}
}

class TestStudent4 {
	
	public static void main(String[] args) {
		Student4 s1 = new Student4();
		Student4 s2 = new Student4();
		
		s1.InsertRecord(111, "Vihan");
		s2.InsertRecord(112, "Sunita");
		
		s1.displayInformation();
		s2.displayInformation();
		
	}

}
