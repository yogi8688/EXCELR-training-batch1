class FizzBizz {   
	public static String getFizzBizz(int number) {
        		if (number <= 0)
           			 return "Error";
		if (number % 3 == 0 && number % 5 == 0) 
		            return "FIZZBIZZ";			
	 	 if (number % 5 == 0)
			return "BIZZ";
	   	 if (number % 3 == 0)
			return "FIZZ";
		return "number:" + number;
	}
}
public class demo020 {
    public static void main(String[] args) {
        FizzBizz obj = new FizzBizz();
        int num = 9;
        System.out.println(obj.getFizzBizz(num));
    }
}