package geeks;

import java.util.Scanner;

public class NumbersAdd
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
int sum=0;
for(int i=n;i>0;i--)
{
	sum=sum+i;
}
System.out.println(sum);
}
}
