package package1;

public class priviteAccessModifierA {
//	privite void m1(){   //privite access modifier
//	void m1() {  //default access modifier
//	  protected void  m1(){  //protected inhertance modifier
	 public void m1() {
		 System.out.println("m1");
	}
	public static void main(String[] args) {
		priviteAccessModifierA a = new priviteAccessModifierA();
		a.m1();
		
	}
	}


