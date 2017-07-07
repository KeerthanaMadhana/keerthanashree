package ksh;
import java.util.*;
public class Numericchar {
	public static void main(String[] args){
		System.out.println("Enter the line");
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine();
		int count=0;
		scan.close();
		for(int i=0;i<line.length();i++){
	   char ch= line.charAt(i);
	   if(Character.isDigit(ch)){
				count++;
			}
		}
		System.out.println(count);
	}
}

