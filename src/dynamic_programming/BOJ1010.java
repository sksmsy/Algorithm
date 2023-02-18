package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
	
	static int t,n,m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		
		int arr[][] = new int[30][30];
		
		for (int i = 0; i < 30; i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}
		
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			System.out.println(arr[m][n]);
		}
		
	}
}
