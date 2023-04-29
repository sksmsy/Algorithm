package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1965 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n];
		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		
		dp[0] = 1;
		cnt = dp[0];
		
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[i] < dp[j]+1) {
					dp[i] = dp[j]+1;
				}
			}
		}
		
		for (int i = 0; i < dp.length; i++) {
			cnt = Math.max(cnt, dp[i]);
		}
		System.out.println(cnt);
	}
}
