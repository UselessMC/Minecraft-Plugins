package mathPrograms;

import java.util.Scanner;

public class SquareRootParser {
	static Scanner scan = new Scanner(System.in);
	public static double startDoub = 1;
	public static double square;
	public static int power;
	public static int decimalPlaces;
	public static int places;

	public static double nextDecimal(Double i, int power) {
		double newDoub = 0;
		for (int j = 0; j < 10; j++) {
			if (Math.pow(i + (1 / Math.pow(10, places)) * j, power) <= square
					&& square <= Math.pow(i + (1 / Math.pow(10, places)) * (j + 1), power)) {
				newDoub = (1 / Math.pow(10, places)) * j;
			} else if (Math.pow(i + (1 / Math.pow(10, places)) * j, power) <= square && square <= Math.pow(i + (1 / Math.pow(10, places)) * (j + 10), power) && j == 9) {
				newDoub = (1 / Math.pow(10, places)) * 10;
				places -= 1;
			}
		}
		return newDoub;
	}

	public static void main(String[] args) {
		while (true) {
			square = scan.nextDouble();
			scan.nextLine();
			power = scan.nextInt();
			scan.nextLine();
			decimalPlaces = scan.nextInt();
			scan.nextLine();
			if (power == 2) {
				if (Math.sqrt(square) < 10) {
					startDoub = 9.0;
				}
				if (Math.sqrt(square) < 9) {
					startDoub = 8.0;
				}
				if (Math.sqrt(square) < 8) {
					startDoub = 7.0;
				}
				if (Math.sqrt(square) < 7) {
					startDoub = 6.0;
				}
				if (Math.sqrt(square) < 6) {
					startDoub = 5.0;
				}
				if (Math.sqrt(square) < 5) {
					startDoub = 4.0;
				}
				if (Math.sqrt(square) < 4) {
					startDoub = 3.0;
				}
				if (Math.sqrt(square) < 3) {
					startDoub = 2.0;
				}
				if (Math.sqrt(square) < 2) {
					startDoub = 1.0;
				}
			} else {
				startDoub = 1.0;
			}
			places = 0;
			while (places < decimalPlaces + 1) {
				if (startDoub * startDoub == (double) square) {
					System.out.println(startDoub);
					break;
				}
				System.out.println(startDoub);
				startDoub += nextDecimal(startDoub, power);
				places++;
			}
		}
	}
}
