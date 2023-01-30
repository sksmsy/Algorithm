package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18429 {

	static int n,k,cnt,arr[];
	static boolean visit[];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visit = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		fn(0,0);
		System.out.println(cnt);
	}
	
	public static void fn(int start, int sum) {
		if(start == n) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < n; i++) {
			int s = sum + arr[i] - k;
			if(visit[i] || s < 0) continue;
			visit[i] =true;
			fn(i,s);
			visit[i] = false;
		}
		
	}
}
