package Assignment2;

//wap to ask string from user and convert each letter to upper case

import java.util.*;
public class Pract4 {
	
	public static void main(String[] args) {
		String a;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String before converstion:- ");
		a=s.nextLine();
		System.out.println("String after converstion:- "+a.toUpperCase());

	}

}
