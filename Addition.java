package logic1;

import java.util.Scanner;

public class Power 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no");
	int n=s.nextInt();
	String str=Integer.toString(n);
	StringBuffer sbf=new StringBuffer();
	int a;
	a=Integer.parseInt((sbf.reverse().toString()));
	
	int t,b=0;
	while(a>0)
	{
		t=a;
		while(t>0)
		{
			b+=t%10;
			t=t/10;
		}
		a=a/10;
	}
	
	System.out.println(a);
}
}
