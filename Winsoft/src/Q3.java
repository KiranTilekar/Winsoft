// Question : Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.nextLine();
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String[] words = s.split(" ");
		
		for(String word:words)
		{
			if(h.containsKey(word))
				h.put(word, h.get(word)+1);
			else
				h.put(word, 1);
		}
		System.out.println(h);
		
	}
}
