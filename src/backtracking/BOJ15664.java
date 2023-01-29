package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15664 {

	
	static int n,m,arr[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
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
		fn(0,0,"");
		System.out.println(sb);
		
	}
	
	static void fn(int cnt, int c, String str) {
		if(cnt == m) {
			sb.append(str).append("\n");
			return;
		}
		
		Set<Integer> set = new HashSet<>();
		for (int i = c; i < n; i++) {
			
			//set add는 같은 값이 이미  있으면 false 없으면 true
			// 있으면 더할수없다 -> false
			if(!set.add(arr[i]))continue;
			fn(cnt+1,i+1,str+arr[i]+" ");
		}
	}
}
