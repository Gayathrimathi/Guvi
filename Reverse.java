package logic1;

import java.util.Scanner;

public class Reverse 
{
public static void main(String[] args) 
{
String s1="welcome to guvi";
	String[]s2=s1.split(" ");
String s3=" ";
int length = s1.length();
for (int i = length - 1; i >= 0; i--)
{
  s3 = s3 + s1.charAt(i);
}
System.out.println(s3);
}
}
	
