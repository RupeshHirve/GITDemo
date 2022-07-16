package objectsAndClass;

class Student3{
	int id;
	String name;
}

class TestStudent3{
public static void main(String[] args) {
	Student1 s1 = new Student1();
	Student1 s2 = new Student1();
	s1.id= 1111;
	s1.name= "Vihan";
	s2.id= 1112;
	s2.name= "Rupesh";
	System.out.println(s1.id+" "+s1.name);
	System.out.println(s2.id+" "+s2.name);
}
}
