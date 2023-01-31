package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21735 {

	static int n,m,arr[], max;
	
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
		fn(0,0);
		System.out.println(max);
	}
	
	public static void fn(int cnt, int tmp) {
		
		if(cnt == m) {
			max = Math.max(max, tmp);
			return;
		}
		
		for (int i = 0; i < m; i++) {
			
			fn(cnt+1, tmp+arr[i]);
		}
	}
}
