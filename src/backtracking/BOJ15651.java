package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * n과m(3)
 */

public class BOJ15651 {
	static int n,m;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		fn(0,"");
		System.out.println(sb);
	}
	
	public static void fn(int cnt, String str) {
		if(cnt == m ) {
			sb.append(str).append("\n");
			return;
		}
		
		for (int i = 0; i < n; i++) {
			fn(cnt+1,str+(i+1)+" ");
		}
	}
}
