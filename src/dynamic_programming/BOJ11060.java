package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11060 {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		long dp[] = new long[1101];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		st = new StringTokenizer(br.readLine());
		
		dp[1] = 0;
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for (int i = 1; i <= n; i++) {
			if(dp[i] >= Integer.MAX_VALUE) continue;
			for (int j = 1; j <= arr[i]; j++) {
				dp[i+j] = Math.min(dp[i+j], dp[i]+1);
			}
		}
		
		if(dp[n]>=Integer.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(dp[n]);
		}
		
	}
}
