package package1;

import java.io.FileNotFoundException;

public class ExceptionHandling {

//	public static void main(String[] args)  throws InterruptedException {
//		Thread.sleep(4000);
//	public static void main(String[] args) {
//		try {
//			Thread.sleep(4000);
//		}catch(InterruptedException exception) {
//			System.out.println(exception.toString());
//		}
//		
//	}
//	public static void main(String[] args) {
//		System.out.println("start");
//		int[] a = new int[10];
//		a[1]=100;
//		a[2]=111;
//		try { 
//			System.out.println(a[11]);	
//		}
//		catch(ArrayIndexOutOfBoundsException exception) {
//			System.out.println(exception.toString());
//		}
//		System.out.println("end");
//	}
	public static void main(String[] args) {
		System.out.println("start");
		int[] a = new int[10];
		a[1]=100;
		a[2]=111;
		try { 
			System.out.println(a[9]);
			int i = 1000/0;
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception.toString());
		}catch(ArithmeticException exception) {
			System.out.println(exception.toString());
		}
		
		System.out.println("end");
	}
}

	


