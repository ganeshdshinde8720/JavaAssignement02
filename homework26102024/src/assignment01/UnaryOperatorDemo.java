package assignment01;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		int a=130;
		System.out.println(a++);         // 130
		System.out.println(++a);         // 132
		System.out.println(++a + a++);   // 266
		System.out.println(--a);         // 133
		System.out.println(--a + ++a);   // 265
		System.out.println(a-- - --a);   // 2
		System.out.println(a);           // 131

	}

}

