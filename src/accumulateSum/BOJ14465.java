package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14465 {

	public static void main(String[] args) throws IOException{
		
		int n,k,b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		int sum[] = new int[n-k+1];
		for (int i = 0; i < n; i++) {
			arr[i] = 1;
		}
		
		for (int i = 0; i < b; i++) {
			st = new StringTokenizer(br.readLine());
			
			int idx = Integer.parseInt(st.nextToken());
			
			arr[idx-1] = 0;
		}
		for (int i = 0; i < k; i++) {
			sum[0] += arr[i];
		}
		int s =1;
		for (int i = k; i <n; i++) {
			sum[s] = sum[s-1] + arr[i] - arr[i-k];
			s++;
		}
		
		
		Arrays.sort(sum);
		System.out.println(k-sum[n-k]);
	}
}
