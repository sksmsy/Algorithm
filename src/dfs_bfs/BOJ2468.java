package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ2468 {
	static int n;
	static int arr[][];
	static boolean visit[][];
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int cnt;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n= Integer.parseInt(st.nextToken());
		
		arr = new int[n][n];
		visit = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(arr[i][j] <= 4) arr[i][j] = 0;
			}
		}
		int res =0 ;
		res = dfs(0,0);
		
		System.out.println(res);
	}
	public static int dfs(int x, int y) {
		
		visit[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int xx = x+dx[i];
			int yy = y+dy[i];
			
			if(xx < 0 || yy < 0 || xx > n-1 || yy > n-1) continue;
			if(visit[x][y]) continue;
			
			if(arr[xx][yy] > 0) {
				dfs(xx,yy);
			}else {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	

}
