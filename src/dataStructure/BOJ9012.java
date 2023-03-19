package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			
			String str = br.readLine();
			Stack<Character> stk = new Stack<Character>();
			boolean chk = false;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				
				if(ch =='(') {
					stk.add(ch);
				}else if(ch == ')'){
					if(stk.empty()) {
						sb.append("NO").append("\n");
						chk = true;
						break;
					}
					stk.pop();
				}
			}
			
			if(!chk) {
				if(!stk.isEmpty()) {
					sb.append("NO").append("\n");
				}else{
					sb.append("YES").append("\n");
				}
			}
			
		}
		System.out.println(sb);
	}
}
