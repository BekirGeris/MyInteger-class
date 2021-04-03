package Bolum_10_Soru_3;

public class MyInteger {
	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPrime() {
		
		boolean temp = true;
		for (int i = 2; i <= value; i++) {
			if (value % i == 0 && value != i) {
				temp = false;
			}
		}
		return temp;
	}
	
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPrime(int value) {
		
		boolean temp = true;
		for (int i = 2; i <= value; i++) {
			if (value % i == 0 && value != i) {
				temp = false;
			}
		}
		return temp;
	}
	

	public static boolean isEven(MyInteger value) {
		if (value.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger value) {
		if (value.getValue() % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger value) {
		
		boolean temp = true;
		for (int i = 2; i <= value.getValue(); i++) {
			if (value.getValue() % i == 0 && value.getValue() != i) {
				temp = false;
			}
		}
		return temp;
	}
	
	public boolean equals(int value) {
		if (this.value == value) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean equals(MyInteger value) {
		if (this.value == value.getValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public int parseInt(char[] intKarekterDizisi) {
		int temp = 0;
		for (int i = 0, j = intKarekterDizisi.length; i < intKarekterDizisi.length; i++, j--) {
			temp += Math.pow(10, j - 1) * Character.getNumericValue(intKarekterDizisi[i]);  
		}
		return temp;
	}
	
	public int parseInt(String bekk) {
		return Integer.parseInt(bekk);
	}
	
	
}
