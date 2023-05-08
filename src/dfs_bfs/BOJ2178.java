package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {

	static int n,m,arr[][],cnt[][];
	static int mx[] = {-1,0,1,0};
	static int my[] = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		cnt = new int[n][m];
		
		bfs(0,0);
		System.out.println(cnt[n-1][m-1]+1);
		
	}
	
	public static void bfs(int x,int y) {
		
		Queue<int[]> q = new LinkedList<>();
		boolean visit[][] = new boolean[n][m];
		visit[0][0]=true;
		q.add(new int[] {x,y});
		
		while(!q.isEmpty()) {
			int cur[] = q.poll();
			int curX = cur[0];
			int curY = cur[1];
			
			if(curX == n-1 && curY == m-1) return;
			for (int i = 0; i < 4; i++) {
				int xx = curX+mx[i];
				int yy = curY+my[i];
				if(xx >= 0 && yy >= 0 && xx < n && yy < m && !visit[xx][yy] && arr[xx][yy] != '0') {
					q.add(new int[] {xx,yy});
					visit[xx][yy] = true;
					cnt[xx][yy] = cnt[curX][curY] + 1;
				}
			}
			
			
		}
		
	
		int answer[] = {};
		answer[0] = 1;
		answer[1] = 2;
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}
