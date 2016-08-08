package logicprograms;

import java.util.Scanner;

public class Sample
{
public static void main(String ar[])throws Exception
{
	{
		int a,t;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int ar1[]=new int[a];
		for(int i=0;i<a;i++)
		ar1[i]=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		for(int j=i+1;j<a;j++)
		{
		if(ar1[i]>ar1[j])
		{
		t=ar1[i];
		ar1[i]=ar1[j];
		ar1[j]=t;
		}
		}
		}
		for(int i=0;i<a-1;i++)
		{
		if(ar1[i]==ar1[i+1])
		{
		    i++;
		    continue;
		}
		else
		System.out.println(ar[i]);
		}

		}
		}
}
