package solutions.java;

public class MarsExploration {
	public static int marsExploration(String s) {
		// Write your code here
		int op = 0;
		for (int i = 0; i < s.length(); i = i + 3) {
			char one = s.charAt(i);
			char two = s.charAt(i + 1);
			char three = s.charAt(i + 2);
			if (one != 'S') {
				op++;
			}
			if (two != 'O') {
				op++;
			}
			if (three != 'S') {
				op++;
			}
		}
		return op;
	}

	public static void main(String[] args) {

		String s = "SOSTOT";

		int result = MarsExploration.marsExploration(s);
		System.out.println(result);
	}
}
