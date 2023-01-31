package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15650 {
	
	static int n,m;
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visit = new boolean[n];
		
		fn(0,0,"");
		System.out.println(sb);
	}
	
	public static void fn(int cnt, int cur, String str) {
		if(cnt == m ) {
			sb.append(str).append("\n");
			return;
		}
		
		for (int i = cur; i < n; i++) {
			if(visit[i])continue;
			visit[i] = true;
			fn(cnt+1,i+1,str+(i+1)+" ");
			visit[i] = false;
		}
	}
}
