package Bolum_10_Soru_3;

public class MyIntegerTest {

	public static void main(String[] args) {

		MyInteger test = new MyInteger(6);

		System.out.println(test.isEven());
		System.out.println(test.isOdd());
		System.out.println(test.isPrime());

		System.out.println("----------------------------------");

		System.out.println(test.isEven());
		System.out.println(test.isOdd());
		System.out.println(test.isPrime());

		System.out.println("----------------------------------");

		System.out.println(MyInteger.isEven(new MyInteger(5)));
		System.out.println(MyInteger.isOdd(new MyInteger(5)));
		System.out.println(MyInteger.isPrime(new MyInteger(5)));
		
		char[] bek = {'7', '8', '2', '9'};
		System.out.println(test.parseInt(bek));
		
		String bek1 = "12548687";
		System.out.println(test.parseInt(bek1));
		
		
		
		
		
		

	}

}
