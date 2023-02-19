package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1788 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean check = false;
		
		int n = Integer.parseInt(br.readLine());
		if(n < 0) {
			check = true;
			n = -n;
		}
		long dp[] = new long[n+2];
		
		
		dp[1] = 1;
		
		if(!check) {
			for (int i = 2; i <= n; i++) {
				dp[i] = (dp[i-1]+dp[i-2])%1000000000;
			}
			
		}else {
			for (int i = 2; i <= n; i++) {
				dp[i] = (dp[i-2]-dp[i-1])%1000000000;
			}
		}
		
		int k = 0;
		long res = dp[n];
		
		if(res > 0) {
			k = 1;
		}else if(res < 0) {
			k = -1;
			res = -res;
		}
		System.out.println(k);
		System.out.println(res);
	}
}
