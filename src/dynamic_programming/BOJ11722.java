package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11722 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}			
		
		
		dp[0] = 1;
		
		for (int i = 1; i < n; i++) {
		
			dp[i]=1;
			
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[i] && dp[j]+1>=dp[i]) {
					dp[i] = dp[j]+1;
				}
				
			}
		}
		int res=0;
		for (int i = 0; i < dp.length; i++) {
			res = Math.max(res, dp[i]);
		}
		System.out.println(res);
	}
}
