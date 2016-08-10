package logic1;

import java.util.Scanner;

public class Power 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no");
	int n=s.nextInt();
	int temp=0;
	temp=n;
	int a = 0;
while(temp>0)
{
	a+=(int)(Math.pow(n%10, temp));
	temp=n%10;
	n=n/10;
}
System.out.println(a);
	
}
}
