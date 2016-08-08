package logicprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RepeatingArray
{
public static void main(String ar[])throws Exception
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the string");
    String s = br.readLine();

    String rev = Reverse(s);

    System.out.println(rev);

}

private static String Reverse(String s) 
{

    char[] modString = new char[s.length()];

    for (int i = 0; i < s.length(); i++) 
    {
        modString[i] = s.charAt(s.length() - 1 - i);
    }

    s = s.copyValueOf(modString);
    String reverseWord = "";
    String eachWord;
    for (String part : s.split(" ")) 
    {
        eachWord = new StringBuilder(part).reverse().toString();
        reverseWord = reverseWord + eachWord + " ";
    }

    return reverseWord;

  }

}
