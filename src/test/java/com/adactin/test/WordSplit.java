package com.adactin.test;

import java.util.Arrays;

public class WordSplit {



	public static boolean WordSplit(String[] strArr) {
        String sequence = strArr[0];
        String[] dictionary = strArr[1].split(",");

        
      public   boolean isInDictionary(String word) {
            return Arrays.asList(dictionary).contains(word);
        }

        
      public   boolean splitSequence(String sequence) {
        
            if (sequence.isEmpty()) {
                return false;
            }

          
            for (int i = 1; i <= sequence.length(); i++) {
                String firstWord = sequence.substring(0, i);

                if (isInDictionary(firstWord)) {
                    String remainingSequence = sequence.substring(i);

                    if (isInDictionary(remainingSequence)) {
                        return true;
                    }

                  
                    if (splitSequence(remainingSequence)) {
                        return true;
                    }
                }
            }

   
            return false;
        }

     
        return splitSequence(sequence);
    }
	
	public static void main(String[] args) {
		String[] input = { "hellocat", "apple,bat,cat,goodbye,hello,yellow,why" };
		boolean result = WordSplit(input);
		System.out.println(result);
	}
}