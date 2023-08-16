package loopPractice;

public class ForLoop {

	public static void main(String[] args) {

		/*******************************
		 * Normal Loop Question
		 ****************************************/

		// 1) Write a Program To print 1 to 25 nos.

		for (int i = 1; i <= 25; i++)
			System.out.print(i + " ");

		// 2) Write a Program To print 25 to 1 nos.
		for (int i = 25; i >= 1; i--)
			System.out.print(i + " ");
		// 3) Write a Program To print 1 to 100 Odd nos.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		// 4) Write a Program To print 1 to 100 even nos.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				System.out.print(i + " ");
		}

		// 5) Write a Program To print sum of 1 to 50 Odd nos.
		int sumOdd = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOdd += i;
			}
		}
		System.out.println(sumOdd);
		// 6) Write a Program To print sum of 1 to 50 EVEN nos.
		int sumEven = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);

		// 7) Write a Program To print -45 to +45 nos.
		for (int i = -45; i <= 45; i++)
			System.out.print(i + " ");

		// 8) Write a Program To print 50 to 100 nos
		for (int i = 50; i <= 100; i++)
			System.out.print(i + " ");

		// 9) Write a Program To print sum of odd and even no.
		int sumEven1 = 0;
		int sumOdd1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sumEven += i;
			else
				sumOdd += i;
		}

		// 14) Write a Program To print count of even No 1 to 25 no.
		// 15) Write a Program To print count of odd No 1 to 25 no.
		int countEven = 0;
		int countOdd = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Even Count:" + countEven + "\n" + "Odd Count: " + countOdd);

		/*******************************
		 * Series Question
		 ****************************************/

		// 1) Generate the Series... 2 4 6 8 10 12 14 16 18 20.
		// 2) Generate the Series... 9 18 27 36 45 54 63 72 81 90.
		// 4) Generate the Series... 5 10 15 20 25 30 35 40 45 50.
		// 7) Generate the Series... 8 16 24 32 40 48 56 64 72 80.
		// 10) Generate the series... 3 6 9 12 15 18 21 24 27 30.
		// 11) Generate the Series... 7 14 21 28 35 42 49 56 63 70.
		// 12) Generate the Series... 4 8 12 16 20 24 28 32 36 40.
		// 13) Generate the Series... 10 20 30 40 50 60 70 80 90 100.

		int table2 = 2;
		int table9 = 9;
		int table8 = 8;
		int table3 = 3;
		int table7 = 7;
		int table4 = 4;
		int table10 = 10;
		int table6 = 6;

		for (int i = 0; i < 10; i++) {

			System.out.print(table2 * i + ",");
			System.out.println();

			System.out.print(table9 * i + ",");
			System.out.println();

			System.out.print(table8 * i + ",");
			System.out.println();

			System.out.print(table3 * i + ",");
			System.out.println();

			System.out.print(table7 * i + ",");
			System.out.println();

			System.out.print(table4 * i + ",");
			System.out.println();

			System.out.print(table10 * i + ",");
			System.out.println();

			System.out.print(table6 * i + ",");
			System.out.println();

		}

		// 3) Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10.

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.print(-i + " ");
			else
				System.out.print(i + " ");
		}

		// 5) Generate the Series... 1 10 100 1000.

		int temp = 1;
		for (int i = 0; i <= 4; i++) {
			System.out.println(temp);
			temp *= 10;
		}

		// 6) Generate the Series... 1 3 6 10 15 21 28 36 45.
		int a = 2;
		for (int i = 1; i <= 45; i += a++)
			System.out.print(i + " ");

		// 8) Generate the Series... 0 1 1 2 3 5 8 13 21
		int first = 0;
		int second = 1;
		int tempVar = 0;

		System.out.println(first + " " + second);

		for (int i = 2; i <= 21; i++) {
			tempVar = first + second;
			System.out.println(tempVar);

			first = second;
			second = tempVar;

		}

		// 9) Generate the series... 1 4 9 16 25 36 49 64 81 100
		int mySum = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				mySum += i;
				System.out.print(i + " ");
			}
		}

		// 14) Generate the Series... 1 2 3 4 5 4 3 2 1

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		for (int i = 4; i >= 1; i--) {
			System.out.print(i);

		}

		// 14) Generate the Series... 1 2 3 4 5 4 3 2 1
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		for (int i = 4; i >= 1; i--) {
			System.out.print(i + " ");

		}
	}
}
