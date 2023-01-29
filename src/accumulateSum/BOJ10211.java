package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10211 {
	public static void main(String[] args) throws IOException {
		
		int t,n;
		int arr[];
		int max;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			max = 0;
			n = Integer.parseInt(br.readLine());
			arr = new int[n+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				
				
				arr[j] = arr[j]+ arr[j-1];
				if(arr[j] > max) max = arr[j];
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
}
