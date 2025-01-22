class SumOf2Digits {
	public static int getSumOf2Digits(int n){
		int a = n / 10;
		int b = n % 10;
		int sum = a + b;
		return sum;
	}
}

public class demo017 {
    public static void main(String[] args) {
        SumOf2Digits obj = new SumOf2Digits();
		int n = 78;
		int sum = obj.getSumOf2Digits(n);
		System.out.println("The sum of 2 digits is :" +sum);
	}
}

