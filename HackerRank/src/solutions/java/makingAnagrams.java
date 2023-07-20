package solutions.java;

public class makingAnagrams {
	public static int makingAnagrams(String s1, String s2) {
		// Write your code here
		int op=0;
		int[] s1Link = new int[26];
		int[] s2Link = new int[26];
		for(int i=0;i<s1.length();i++) {
			s1Link[(int)s1.charAt(i)-97]=s1Link[(int)s1.charAt(i)-97]+1;
		}
		for(int i=0;i<s2.length();i++) {
			s2Link[(int)s2.charAt(i)-97]=s2Link[(int)s2.charAt(i)-97]+1;
		}
		for(int i=0;i<26;i++) {
			if(s1Link[i]==0 && s2Link[i]!=0) {
				op+=s2Link[i];
			}
			if(s1Link[i]!=0 && s2Link[i]==0) {
				op+=s1Link[i];
			}
			if(s1Link[i]!=0 && s2Link[i]!=0) {
				op+=Math.abs(s1Link[i]-s2Link[i]);
			}
		}
		return op;
	}

	public static void main(String[] args) {
			String s1="aaaabbccd";
			String s2="eefcaabb";
			makingAnagrams(s1, s2);
	}

}
