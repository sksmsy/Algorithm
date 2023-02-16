package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2775 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k,n;
		int t = Integer.parseInt(br.readLine());
		
		long arr[][] = new long[15][15];
		
		for (int i = 0; i < 15; i++) {
			arr[0][i] = i;
		}
		
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				arr[i][j] = arr[i][j-1]+arr[i-1][j];
			}
		}
		
		while(t-- > 0) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			System.out.println(arr[k][n]);
		}
		
	}
}
