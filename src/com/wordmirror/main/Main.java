package com.wordmirror.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter your Sentence: ");
		String input = "";
		
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			input = bufferRead.readLine();
		} catch(IOException e) {
			System.out.println("Something's wrong with your input :/");
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Result: ");
		System.out.println(new Main().mirrorInput(input));
		
	}
	
	public String mirrorInput(String input) {
		String[] inputArr = input.split(" ");
		String result = "";
		
		for(int i = 0; i < inputArr.length; i++) {
			if(inputArr[i].length() < 3) {
				result += inputArr[i];
			} else {
				result += mirrorWord(inputArr[i]);
			}
			
			if(i < inputArr.length - 1) {
				result += " ";
			}
		}
		
		return result;
	}
	
	private String mirrorWord(String input) {
		
		String firstHalf = input.substring(0, input.length() / 2);
		String mirroredHalf = new StringBuilder(firstHalf).reverse().toString();
		
		return (wordHasMiddle(input)) ? firstHalf + input.charAt(input.length() / 2) + mirroredHalf : firstHalf + mirroredHalf;
			
		
	}
	
	private boolean wordHasMiddle(String input) {
		return !(input.length() % 2 == 0);
	}

}
