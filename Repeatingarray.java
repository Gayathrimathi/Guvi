package logicprograms;

import java.util.Scanner;

public class RepeatingArray {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("enter no of element");
		String str = s.next();
		String[] strArray = str.split(",");

		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if ((strArray[i].equals(strArray[j])) && (i != j)) {
					System.out.println("Repeating Element is : " + strArray[j]);
				}
			}
		}
	}

}
