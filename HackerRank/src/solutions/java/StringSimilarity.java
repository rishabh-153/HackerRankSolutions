package solutions.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringSimilarity {
	public static int stringSimilarity(String s) {
		// Write your code here
		List<String> suffixes = generateAllSuffixes(s);
		int op=0;
		for(String suffix:suffixes) {
			if(suffix.equals(s)) {
				op+=s.length();
			}else {
				int i=0;
				while(i<suffix.length()) {
					char charS=s.charAt(i);
					char charSuffix =suffix.charAt(i);
					if(charS==charSuffix) {
						op++;
						i++;
					}else {
						i=Integer.MAX_VALUE;
					}
					
				}
			}
		}
		return op;
	}

	private static List<String> generateAllSuffixes(String s) {
		List<String> op = new ArrayList<>();
		op.add(s);
		for(int i=1;i<s.length();i++) {
			op.add(s.substring(i));
		}
		return op;
	}

	public static void main(String[] args) {
		String s = "ababaa";

		int result = StringSimilarity.stringSimilarity(s);
		System.out.println(result);

	}

}
