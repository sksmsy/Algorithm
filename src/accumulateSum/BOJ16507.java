package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16507 {

	static int r,c,arr[][],q,r1,c1,r2,c2;
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		arr = new int[r+1][c+1];
		
		for (int i = 1; i <= r; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= c; j++) {
				arr[i][j] = arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			r1 = Integer.parseInt(st.nextToken());
			c1 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			c2 = Integer.parseInt(st.nextToken());
			
			int area = ((c2-c1)+1)*((r2-r1)+1);
			
			int sum = arr[r2][c2] - arr[r1-1][c2] - arr[r2][c1-1] + arr[r1-1][c1-1];
			System.out.println(sum/area);
		}
	}
}
