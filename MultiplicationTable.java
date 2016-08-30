package geeks;

import java.util.Scanner;

public class MultiplicationTable
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int a=s.nextInt();
	System.out.println("enter no");
	int b=s.nextInt();
	System.out.println("table is");
	while(b<=20)
	{
		
		System.out.println(+(a*b));
		b++;
	}
}
}

