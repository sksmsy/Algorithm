package pr;

public class 신규아이디추천 {

	public static void main(String[] args) {
		
		String answer ="";
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		
		//1~5
		
		answer = new_id.toLowerCase(); 
		System.out.println(answer);
		
		
		answer = answer.replaceAll("[^\\w\\-_.]*", "");
		answer = answer.replaceAll("\\.{2,}", ".");
		answer = answer.replaceAll("^[.]|[.]$", "");
		answer = answer.length() == 0 ? "a":answer;
		
		
		//6
		if(16<= answer.length()) {
			answer = answer.substring(0,15).replaceAll("^[.]|[.]$", "");
		}
		
		//7
		answer = minLength(answer);
		
		System.out.println(answer);
	}
	
	
	public static String minLength(String str) {
		if(2<str.length()) return str;
		
		str += str.charAt(str.length()-1);
		
		return minLength(str);
	}
}
