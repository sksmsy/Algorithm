package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14929 {

	public static void main(String[] args) throws IOException{
		
		int n,k;
		int arr[],sum[];
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		sum = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			arr[i] = temp;
			sum[i] = arr[i]+sum[i-1];
		}

		int max = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < k; j++) {
				
				if()
			}
		}
	}
}
