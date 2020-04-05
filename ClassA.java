package learnInheritance;

public class ClassA extends ClassB {
	// left hand side is the child which is known as subclass
	// right hand side is the parent which is known as superClass
	
	int ax = 55;
	static int ay= 66;

	public static void main(String[] args) {
		A1();
		ClassA objA = new ClassA();
		objA.A2();
		System.out.println(objA.ax);
		System.out.println(ay);
		
		B1();
		objA.CallParentB1();
		objA.B2();
		System.out.println(objA.bx);
		System.out.println(by);
		
		C1();
		objA.C2();
		System.out.println(objA.cx);
		System.out.println(cy);
	}
	public static void A1() {
		System.out.println("A1");
	}
	public void A2() {
		System.out.println("A2");
	}
//	public static void B1() {
//		System.out.println("My modification");
//	}
	public void CallParentB1() {
		super.B1();
	}

}
