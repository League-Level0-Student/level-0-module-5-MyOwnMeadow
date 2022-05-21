package _01_algorithms._2_fibonacci;

public class Fibanachi {
	public static void main(String[]args) {
		int num1 = 0;
		int num2 = 1;
		int numStore = 0;
		int langth = 10;
		System.out.println(num1 + "\n" + num2);
		for(int i = 0; i < langth; i += 1) {
			numStore = num2;
			num2 = num1 + num2;
			num1 = numStore;
			System.out.println(num2);
		}
	}

}
