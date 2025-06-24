
public class patternPrinting {

	public static void main(String[] args) {

		System.out.println();

//		square printing 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

//		printing a right angle triangle  
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j >= 8 - (i + 1)) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}

		// Pyramid printing
		// find mid of pyramid
		int no = 11, ptlen = 1, mid, midlen;
		if (no % 2 == 0) {
			mid = no / 2;
		} else {
			mid = (no / 2) + 1;
		}
		midlen = mid;
		System.out.println();

		for (int i = 1; i <= midlen; i++) {
			int tempptlen = ptlen;
			for (int j = 1; j <= no; j++) {
				if (j >= mid && tempptlen > 0) {
					System.out.print('*');
					--tempptlen;
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
			ptlen += 2;
			--mid;
		}
	}

}
