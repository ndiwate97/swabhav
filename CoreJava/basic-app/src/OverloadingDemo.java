public class OverloadingDemo {
	public static void main(String[] args) {

		Boolean b = false;
		char c = 'a';
		int i = 10;
		long l = 100000;
		float f = 1.5f;
		double d = 15.4;
		
		String s = "This is string";
		
		printBooleanValue(b);
		printCharacterValue(c);
		printIntegerValue(i);
		printLongValue(l);
		printFloatValue(f);
		printDoubleValue(d);
		printStringValue(s);
		
		System.out.println(overload(1));
		System.out.println(overload("hello"));
	}

	private static String overload(String no) {
		return(no);
		
	}

	private static int overload(int no) {
		return(no);
	}


	public static void printBooleanValue(Boolean var) {
		System.out.println(var);
	}

	public static void printCharacterValue(char var) {
		System.out.println(var);
	}

	public static void printIntegerValue(int var) {
		System.out.println(var);
	}

	public static void printLongValue(long var) {
		System.out.println(var);

	}

	public static void printFloatValue(float var) {
		System.out.println(var);

	}

	public static void printDoubleValue(double var) {
		System.out.println(var);

	}

	public static void printStringValue(String var) {
		System.out.println(var);

	}
}