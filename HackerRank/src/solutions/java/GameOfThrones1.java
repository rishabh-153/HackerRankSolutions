package solutions.java;

public class GameOfThrones1 {
	public static String gameOfThrones(String s) {
		// Write your code here
		int[] counter = new int[26];
		boolean isOdd=false;
		//a-z 97 - 122
		for(int i=0;i<s.length();i++) {
			counter[(int)s.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			if(counter[i]%2!=0) {
				if(isOdd) {
					return "NO";
				}else {
					isOdd=true;
				}
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababac";

		String result = GameOfThrones1.gameOfThrones(s);
		System.out.println(result);
	}

}
