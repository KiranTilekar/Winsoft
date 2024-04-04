// Question : Write a Java Program to find the duplicate characters in a string.

import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		String s = "ABCDABCD";
		
		int l = s.length();
		char[] str = s.toCharArray();
		Arrays.sort(str);
		String sorted = new String(str);
		
		System.out.println("Duplicate characters in string are:");
		
		for(int i=0;i<l;i++)
		{
			int count = 1;
			
			while(i<l-1 && sorted.charAt(i)==sorted.charAt(i+1))
			{
				count++;
				i++;
			}
			
			if(count>1)
				System.out.println(sorted.charAt(i)+" count="+count);
		}
	}
}
