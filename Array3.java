package logicprograms;

import java.util.Scanner;

public class Check
{
public static void main(String ar[])throws Exception
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter array");
a=sc.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
arr[a]=sc.nextInt();
for(int i=0;i<a;i++)
{
if(arr[a]==i)
System.out.println("the number"+ar[i]+"is equals to its index"+i);
}
}
}
