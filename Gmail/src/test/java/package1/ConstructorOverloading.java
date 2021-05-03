package package1;

public class ConstructorOverloading {
	private int index;
	public ConstructorOverloading() {
		index = 0;
	}
	
	public ConstructorOverloading( int index) {
		this.index = index;
	}
	public ConstructorOverloading(double index) {
		this.index = (int) index;
	}
	public void m1() {
		System.out.println("string = " + index);
	}
	public static void main(String[] args) {
		 ConstructorOverloading a = new  ConstructorOverloading();
		 a.m1();
		 ConstructorOverloading b = new  ConstructorOverloading(100);
		 b.m1();
		 ConstructorOverloading c = new  ConstructorOverloading(1000);
		 c.m1();
	}
}
