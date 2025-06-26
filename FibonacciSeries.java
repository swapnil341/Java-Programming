public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("1\n1");
		int a , b ;
		a = b = 1 ;
		int sum = 0 ;
		int n = 10 ; 
		while(n > 0) {
			sum = a + b ;
			System.out.println(sum);
			b = a ;
			a = sum ;
			n-- ;
		}
	}

}
