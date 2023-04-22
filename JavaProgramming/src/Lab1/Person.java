package Lab1;

public class Person {
	public String name;
	public String phone;
	
	Person(){
		name = "";
		phone = "";
	}
	
	Person(String newName){
		name = newName;
		phone = "";
	}
	
	Person(String newName, String newPhone){
		name = newName;
		phone = newPhone;
	}
	
	public void printName() {
		System.out.println("Name : " + name);
	}
	
	public void printPhone() {
		System.out.println("Phone : " + phone);
	}
	
}
