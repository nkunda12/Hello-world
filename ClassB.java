package learnInheritance;

public class ClassB extends ClassC{
	
	int bx = 55;
	static int by= 66;
	
	final public static void B1() {
		// final key word stop any modification
		// from the Inheritance
		System.out.println("B1");
	}
	public void B2() {
		System.out.println("B2");
	}

}
