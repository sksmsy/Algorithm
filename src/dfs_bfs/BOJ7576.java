package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
	
	static int m,n,arr[][],res;
	static boolean visit[][];
	static int xx[] = {1,0,-1,0};
	static int yy[] = {0,1,0,-1};
	static 	Queue<Coor> q = new ArrayDeque<>();	
	
	public static class Coor {
		int x;
		int y;
		int day;
		
		public Coor(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		search();
		bfs();
		
		if(chkResult()) {
			System.out.println(res);
		}else {
			System.out.println(-1);
		}
		
	}
	
	public static void bfs() {
		
		
		while(!q.isEmpty()) {
			Coor c = q.poll();
			
			int x = c.x;
			int y = c.y;
			int day = c.day;
			
			res = Math.max(res, day);
			
			for (int i = 0; i < 4; i++) {
				int nx = x+xx[i];
				int ny = y+yy[i];
					
				if(nx>=n || nx<0 || ny>=m || ny<0 || visit[nx][ny] || arr[nx][ny] == -1) {
					continue;
				}
				
				Coor nc = new Coor(nx,ny,day+1);
				visit[nx][ny] = true;
				q.add(nc);
			}
			
		}
		
	}
	
	public static void search() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j] == 1) {
					Coor c = new Coor(i, j, 0);
					q.add(c);
					visit[i][j] = true;
				}
			}
		}
	}
	
	public static boolean chkResult() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!visit[i][j] && arr[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
