package geeks;

import java.util.Scanner;

public class Combination 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	int sum=0;
	for(int i=n;i<15;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
	int x=15;
	while(x<=45)
	{
		if(x%2!=0)
		{
			System.out.println(x);
			}
		x++;
	}
}
	
}

