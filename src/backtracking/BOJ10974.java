package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 모든순열 
 */
public class BOJ10974 {

	static int n;
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
	
		visit = new boolean[n];
		fn(0,"");
		System.out.println(sb);
	}
	
	static void fn(int cnt , String str) {
		
		if(cnt == n) {
			sb.append(str).append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			if(visit[i]) {
				continue;
			}
			visit[i] = true;
			fn(cnt+1,str+(i+1)+" ");
			visit[i] = false;
		}
	}
}
