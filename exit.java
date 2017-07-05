package kshree;
import java.util.Scanner;
public class Quit {
	public static void main(String[] args){
		String a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any letter");
		a=in.next();
		a=a.toLowerCase();
		switch(a){
		case "q":
			System.out.println("Exit");
			break;
		}
	}

}

