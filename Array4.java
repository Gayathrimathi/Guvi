package logicprograms;

import java.util.Scanner;

public class RepeatingArray
{
public static void main(String ar[])throws Exception
{
	public static void printElements(int[] a)
	{
	for(int i=0;i<a.length;i++)
	{
	boolean isDistinct = false;
	for(int j=0;j<i;j++)
	{
	if(a[i] == a[j])
	{
	isDistinct = true;
	break;
	}
	}
	if(!isDistinct)
	{
	System.out.print(a[i]+" ");
	}
	}
	}
	     
	public static void main(int[] a)
	{
		RepeatingArray de=new RepeatingArray();
	int n;
	System.out.println("Enter total no of values in the array");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	arr1[i]=s.nextInt();
	de.printElements(a);
	}
	}


