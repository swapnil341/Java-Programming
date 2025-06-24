
public class largestOf3 {

	public static void main(String[] args) {
		int a = 200;
		int b = 65;
		int c = 855;

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is Greatest among " + b + " and " + c);
			} else {
				System.out.println(c + " is Greatest among " + a + " and " + b);
			}
		} else {
			if (b > c) {
				System.out.println(b + " is Greatest among " + a + " and " + c);
			} else {
				System.out.println(c + " is Greatest among " + a + " and " + b);
			}
		}
	}

}
