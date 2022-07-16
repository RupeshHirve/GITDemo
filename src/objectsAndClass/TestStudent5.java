package objectsAndClass;


class Student5{
	int id;
	String name;
	
	void insertRecord(int n, String r ) {
		id=n;
		name=r;
	}
	void displayInformation() {
		System.out.println(id+" "+name);
	}
	
}

public class TestStudent5 {
	public static void main(String[] args) {
		Student5 s1 = new Student5();
		s1.insertRecord(111, "Sunil");
		s1.displayInformation();

	}

}
