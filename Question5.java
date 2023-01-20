package zoho.test;

import java.util.HashMap;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		{
	        String input = "hello world please";
	        String reference = "help";

	        HashMap<Character, Integer> charCount = new HashMap<>();
	        for (int i = 0; i < reference.length(); i++) {
	            charCount.put(reference.charAt(i), 0);
	        }

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (charCount.containsKey(c)) {
	                int count = charCount.get(c);
	                charCount.put(c, count + 1);
	            }
	        }

	        for (char c : charCount.keySet()) {
	            System.out.println(c + ": " + charCount.get(c));
	        }
	    }
	}

}
