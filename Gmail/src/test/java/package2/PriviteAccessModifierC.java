package package2;

import package1.priviteAccessModifierA;

//public class PriviteAccessModifierC extends priviteAccessModifierA  { //inhertance
public class PriviteAccessModifierC { //public
	public static void main(String[] args) {
		priviteAccessModifierA a = new priviteAccessModifierA();
		a.m1();
	}

}
