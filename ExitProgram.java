package geeks;

import java.util.Scanner;

public class ExitPro 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("press q");
	char c=s.next().charAt(0);
	if(c=='Q'|| c=='q')
	{
		System.out.println("exited");
		System.exit(0);
	}
}
}
