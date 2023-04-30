package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15724 {
	
	static int n,m,ps[][],k;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		ps	= new int[n+1][m+1];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				ps[i][j] = ps[i][j-1]+ps[i-1][j] - ps[i-1][j-1] + tmp;
			}
		}
		
		k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k ; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int res = ps[x2][y2]-ps[x2][y1-1]-ps[x1-1][y2]+ps[x1-1][y1-1]; 
			
			sb.append(res).append("\n");
		}
		
	System.out.println(sb);
	}
}
