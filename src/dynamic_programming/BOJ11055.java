package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ11055 {
	static int n,arr[],dp[],max;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		dp[0] = arr[0];
		max = dp[0];
		for (int i = 1; i < n; i++) {
			dp[i] = arr[i];
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[i] < dp[j]+arr[i]) {
					dp[i] = dp[j]+arr[i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
