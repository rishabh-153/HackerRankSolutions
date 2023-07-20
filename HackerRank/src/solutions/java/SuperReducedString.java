package solutions.java;

class Result {

	public static String superReducedString(String s) {
		String regex = "([a-z])\\1";
	    String result;
	    while(true){
	             result = s.replaceFirst(regex, "");
	             s = result.replaceFirst(regex, "");
	             if (result.equals(s)){
	                 break;
	             }
	        }
	        if (result.isEmpty()){
	            result = "Empty String";
	        }
	        return result;
	}

}

public class SuperReducedString {
	public static void main(String[] args) {

		String s = "aaaaabbcccd";

		String result = Result.superReducedString(s);
		System.out.println(result);
	}
}
