package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8394 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long dp[] = new long[n+2];
		
		dp[1]=1;
		dp[2]=2;
		
		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1]+dp[i-2])%10;
		}
		
		System.out.println(dp[n]);
	}
}
