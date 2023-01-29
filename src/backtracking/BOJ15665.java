package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*
 * n과m(11)
 */
public class BOJ15665 {
	
	static int n,m,arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		fn(0,"");
		System.out.println(sb);
	}
	
	static void fn(int cnt, String str) {
		if(cnt == m) {
			sb.append(str).append("\n");
			return;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if(!set.add(arr[i])) continue;
			fn(cnt + 1, str+arr[i]+" ");
		}
		
	}
	
	
	
	
}
