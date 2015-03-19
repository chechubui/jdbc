package ejercicios;

public class Problem1 {
	static String s;
	static class Inner {
		static void testMethod() {
			s = "Set from Inner";
		}
	}
	public static void main(String[] args) {
		Problem1.Inner.testMethod();
		System.out.println(Problem1.s);
	}
		
}
