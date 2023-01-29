package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

/*
 * n과m(4)
 * 
 */

public class BOJ15652 {

	static int n,m;
	static int [] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		
		
	}
	
	public static void dfs(int s , int depth) {
		if(depth == m) {
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append("\n");
			return;
		}
		
		for (int i = s; i <=n; i++) {
			arr[depth] = i;
			dfs(i,depth+1);
		}
		
		
	}
}
