package package1;

public class MethodOverloading {
	public void m1() {
		System.out.println("name");
	}
	public void m1(String firstName) {
		System.out.println("name" + firstName );
	}
	public void m1(String firstName,String lastName) {
		System.out.println("name" +  firstName + lastName);
	}
public static void main(String[] args) {
	MethodOverloading a = new MethodOverloading();
	a.m1();
	a.m1("sindhu");
	a.m1("sindhu","chillara");
	
}
}
