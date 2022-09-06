package solutions.java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class anagramstrings {

    public static int anagram(String s) {
    // Write your code here
    	int sLen=s.length();
    	if(sLen%2!=0) {
    		return -1;
    	}
    	int returnVal=0;
    	String p1=s.substring(0,sLen/2);
    	String p2=s.substring(sLen/2,sLen);
    	int[] p1Arr = new int[26];
    	int[] p2Arr = new int[26];
    	for(int i=0;i<p1.length();i++) {
    		p1Arr[(int)p1.charAt(i)-97]++;
    	}
    	for(int j=0;j<p2.length();j++) {
    		p2Arr[(int)p2.charAt(j)-97]++;
		}
    	for(int i=0;i<26;i++) {
    		returnVal+=Math.abs(p1Arr[i]-p2Arr[i]);
    	}
    	return returnVal/2;
    }

    public static void main(String[] args) throws IOException {
        anagram("xaxbbbxx");
    }
}

