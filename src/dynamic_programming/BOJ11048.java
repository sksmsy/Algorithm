package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11048 {

	static int n,m,arr[][],dp[][];
	static int mx[] = {1,0,1};
	static int my[] = {0,1,1};
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = arr[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				for (int k = 0; k < 3; k++) {
					int xx = i+mx[k];
					int yy = j+my[k];
					
					if(xx>=0 && yy >=0 && n>xx && m>yy) {
						int tmp = dp[i][j]+arr[xx][yy];  
						dp[xx][yy] = Math.max(dp[xx][yy], tmp);
					}
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
	}
}
