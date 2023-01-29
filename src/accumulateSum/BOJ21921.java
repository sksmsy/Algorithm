package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ21921 {
	public static void main(String[] args) throws IOException {
		
		int n,x;
		int arr[];
		int sum[];
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		sum = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			sum[i] = arr[i-1] + arr[i];
		}
		int max=0;
		for (int i = 1; i <= n; i++) {
		
			for (int j = i; j <= x; j++) {
				max = Math.max(max, sum[j]+sum[j-1]-arr[i]);
			}
		}
		
		System.out.println(max);
	}
}
