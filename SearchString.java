package com.deccon.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchString {
public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
	al.add("Cecilio Johnes");
	al.add("Cordell Acott");
	al.add("Curtice Bleue");
	al.add("Dalis Menary");
	al.add("Emanuele Barstock");
	al.add("Emmy Bradane");
	al.add("Gian Cossington");
	al.add("Jamaal Danilevich");
	al.add("Kerri Wilce");
	al.add("Liuka Cowern");
	al.add("Marlee Stobo");
	al.add("Merrel Cornuau");
	al.add("Rochette Brew");
	al.add("Rudyard Abbate");
	al.add("Sharona Climo");
	al.add("Shirlee Titcumb");
	al.add("Taite Joriot");
	al.add("Taite Huntriss");
	al.add("Zach Simchenko");
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String to find the existing string from an array");
		String str=scan.next();
		for (String element : al){
	         if (element.contains(str)){
	               System.out.println(element);
	         }
	      }
		scan.close();

	
}

}
