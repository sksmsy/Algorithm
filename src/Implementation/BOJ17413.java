package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stk = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int size = str.length();
		
		
		boolean skip = false;
		for (int i = 0; i < size; i++) {

			if(str.charAt(i) =='<') {
				while(!stk.isEmpty()) {
					sb.append(stk.pop());
				}
				skip = true;
			}else if(str.charAt(i) == '>') {
				skip = false;
				sb.append(str.charAt(i));
				continue;
			}
			
			if(skip) {
				sb.append(str.charAt(i));
			}
			else if(skip == false) {
				if(str.charAt(i) == ' ') {
					while(!stk.isEmpty()) {
						sb.append(stk.pop());
					}
					sb.append(" ");
					continue;
				}else {
					stk.push(str.charAt(i));
				}
			}
			
			if(i == size - 1) {
				while(!stk.isEmpty()) {
					sb.append(stk.pop());
				}
			}
			
			
		}
		System.out.println(sb);
	}
}
