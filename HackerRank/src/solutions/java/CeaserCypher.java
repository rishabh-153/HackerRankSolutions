package solutions.java;

public class CeaserCypher {
	public static String caesarCipher(String s, int k) {
		// Write your code here
		StringBuilder sb = new StringBuilder();
		int kReduced = k%26;
		//a-z 97 - 122
		//A-Z 65 - 90
		for(int i=0;i<s.length();i++) {
			int val = (int)s.charAt(i);
			if((val>96 && val<123) || (val>64 && val<91)) {
				if(val>96 && val<123) {
					//a-z
					val=val+kReduced;
					if(val>122) {
						val = val-26;
					}
				}
				else if(val>64 && val<91) {
					//A-Z
					val=val+kReduced;
					if(val>90) {
						val = val-26;
					}
				}
				sb.append((char)val);
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "There's a strong wind in-the sky--todayY.";
		caesarCipher(S,10);
	}

}
