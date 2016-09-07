package LogicPro;

import java.util.Scanner;

public class SquarePrg {

		public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		 String str = s.next();
		String s1[] = str.split(",");
		boolean f = false;
		if (s1.length == 8) {
			if (s1[0].equals(s1[2]) && s1[4].equals(s1[6]) && s1[1].equals(s1[7]) && s1[3].equals(s1[5])) {
				f = true;
			}
		}
		if (f) {
			System.out.println("Square");

		} else {
			System.out.println("Not Squre");
		}

	}
}
