package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) { 
    	String str1="CAT";
    	String str2="ACT";
    	System.out.println("Both strings are anagrams"+ anagramCheck(str1, str2));
    	
    }
    	
    	public static boolean anagramCheck(String str1,String str2){
    		
    		char[] charArrayFromString1=str1.toCharArray();
    		char[] charArrayFromString2=str2.toCharArray();
    		Arrays.sort(charArrayFromString1);
    		Arrays.sort(charArrayFromString2);
    		
    		return Arrays.equals(charArrayFromString1, charArrayFromString2);
    		
    		
    		
    		
    		
    		    		
    		
    		
    	}
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    }

