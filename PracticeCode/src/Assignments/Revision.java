package Assignments;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factor(-10);


	}
	static void factor(int num) {
		if (num > 0) {
			for (int i = 1; i <= num; ++i) {
				if (num % i == 0) {
					System.out.print(i + ", ");
				}
			}
		} else {
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		}
		System.out.println();
	}

}

