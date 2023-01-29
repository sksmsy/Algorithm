package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11441 {

	public static void main(String[] args) throws IOException {
		
		int n,m,i,j;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n+1];
		
		for (int k = 1; k <= n; k++) {
			arr[k] = Integer.parseInt(st.nextToken());
			
			arr[k] = arr[k-1] + arr[k];
		}
		
		st = new StringTokenizer(br.readLine());
		m = Integer.parseInt(st.nextToken());
		
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			
			sb.append(arr[j] - arr[i-1]).append("\n");
		}
		System.out.println(sb);
	}
}
