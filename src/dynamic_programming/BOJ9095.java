package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		long dp[] = new long[1_000_001];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 4; i <= 1_000_000 ; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		for (int i = 0; i < n; i++) {
			int j = Integer.parseInt(br.readLine());
			sb.append(dp[j]).append("\n");
		}

		System.out.println(sb);
	}
}
