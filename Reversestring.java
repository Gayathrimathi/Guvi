package logicprograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckString
{
public static void main(String ar[])throws Exception
{
	 String original,rev="";
	   System.out.println("enter string :");
	   Scanner s=new Scanner(System.in);
	   original=s.nextLine();
	   String[] Arr=original.split(" ");
	   for(int i=Arr.length-1;i>=0;i--)
	     {
	       rev=rev+" "+Arr[i];
	     }
	     System.out.println("reverse string is:\n"+rev);
	  }
	} 
