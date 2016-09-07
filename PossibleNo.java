import java.util.Scanner;

public class possibleNo 
{
    public static void main(String[] args)
    {
        int n=0,c=0,d=0;
        int no1 = 0;
        int no2=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        n=((a.length)/2);
        if(n==3)
        {
            for(int i=0;i<a.length-2;i++)
            {
                c=c+a[i];
                no1=c/2;
            }
                System.out.println(no1);
      for(int i=3;i<a.length;i++)
              {
         d=d+a[i];
         no2=d/2;
      }
      System.out.println(no2);
     if(no1==no2)
     {
      System.out.println("possible numbers");  }
       else
     {
         System.out.println("not possible");
     }
        
    }}
}
