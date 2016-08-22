package logic1;
import java.util.Scanner;

public class Pyramid1 
{
	 public static void main (String[] args) throws Exception{
         
        Scanner s=new Scanner(System.in);
        
         System.out.println("Enter Number:");
         int b= s.nextInt();
         System.out.println("Enter a:");
         int a=  s.nextInt();
          
         int c = 1;
        
         for(int i=0; i<= b ;i++){
                
                 for(int j=1; j <= i ; j++){
                         System.out.print(c + "\t");
                         c = c + a;
                 }
                
                 System.out.println("");
         }
}
}
