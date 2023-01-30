package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2992 {

	static String input;
	static int x,len,arr[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		input = br.readLine();
		len = input.length();
		
		x = Integer.parseInt(input);
		arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			arr[i] = input.charAt(i);
		}
		fn(0,"");
		System.out.println(sb);
	}

	public static void fn(int start , String str) {
		if(start == len) {
			sb.append(str).append("\n");
			return;
		}
		
		
		for (int i = 0; i < len; i++) {
			fn(start+1, str+arr[i]+"");
		}
	}
	
	
}
