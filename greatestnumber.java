package shree;
import java.util.Scanner;
public class Greatestnumber {
   public static void main(String args[]) {
	   int a,b,c;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the numbers:");
	   a=s.nextInt();
	   b=s.nextInt();
	   c=s.nextInt();
	   if(a>=b && a>=c)
	   {
		   System.out.println("Largest number is:"+a);
	   }
	   if(b>=a && b>=c) 
	   {
		   System.out.println("Largest number is:"+b);
	   }
	   else if(c>=a && c>=b)
	   {
		   System.out.println("Largest number is:"+c);
	   }
	   
   }
}
