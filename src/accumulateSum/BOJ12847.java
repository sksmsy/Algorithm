package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ12847 {
	public static void main(String[] args) throws IOException{
		
		int n,m;
		int arr[];
		long sum[];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		
		
		arr = new int[n];
		sum = new long[n-m+1];
		st =  new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		
//		sum[0] = arr[1]+arr[2]+arr[3];
//		sum[1] = arr[2]+arr[3]+arr[4];
//		sum[1] = sum[0] - arr[1] + arr[4];
		for (int i = 0; i < m; i++) {
			sum[0] += arr[i];
		}
		
		int s = 1;
		for (int i = m; i < n ; i++) {
			sum[s] = sum[s-1] +arr[i] - arr[i-m];
			s++;
		}
		
		Arrays.sort(sum);
		
		System.out.println(sum[n-m]);
		
	}
}
