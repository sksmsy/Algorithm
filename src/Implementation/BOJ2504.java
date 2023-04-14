package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2504 {

	static char arr[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stk = new Stack<>();
		String str = br.readLine();
		
		int size = str.length();
		int value = 1;
		int res = 0;
		
		for (int i = 0; i < size; i++) {
			
			if(str.charAt(i) == '(') {
				stk.push(str.charAt(i));
				value *= 2;
			}
			else if(str.charAt(i) == '[') {
				stk.push(str.charAt(i));
				value *= 3;
			}
			else if(str.charAt(i) == ')') {
				if(stk.isEmpty() || stk.peek() != '(') {
					res = 0;
					break;
				}else if(str.charAt(i-1) == '(') {
					res += value;
				}
				stk.pop();
				value /= 2;
			}
			else if(str.charAt(i) == ']') {
				if(stk.isEmpty() || stk.peek() != '[') {
					res = 0;
					break;
				}else if(str.charAt(i-1) == '[') {
					res += value;
				}
				stk.pop();
				value /= 3;
			}
			
		}
		if(!stk.isEmpty()) {
			res = 0;
		}
		System.out.println(res);
		
		
	}
}
