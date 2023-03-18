package review.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ1012 {
	
	static int t,m,n,k,cnt,arr[][];
	static boolean visit[][];
	static int dx[] = {0,-1,0,1};
	static int dy[] = {1,0,-1,0};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int q = 0; q < t; q++) {
			
			cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			arr = new int[m][n];
			visit = new boolean[m][n];
			
			
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine());
					
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				arr[a][b] = 1;
			}
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if(!visit[i][j] && arr[i][j] == 1) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	public static void dfs(int x, int y) {
		
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<m && ny<n) {
				if(!visit[nx][ny] && arr[nx][ny] == 1) {
					dfs(nx,ny);
				}
			}
			
		}
	}
}
