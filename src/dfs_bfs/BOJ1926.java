package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1926 {

	static int n,m,maxLeng,res;
	static int arr[][];
	static boolean visit[][];
	static int xx[] = {1,0,-1,0};
	static int yy[] = {0,1,0,-1};
	
	public static class Node{
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new boolean[n][m];
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	
		maxLeng = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!visit[i][j] && arr[i][j] == 1) {
					visit[i][j] = true;
					fn(new Node(i,j));
				}
			}
		}
		sb.append(res).append("\n");
		sb.append(maxLeng);
		
		
		System.out.println(sb);
	}
	
	public static void fn(Node node) {
		Queue<Node> q = new LinkedList<>();
		
		q.add(node);
		int cnt = 1;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			int cx = cur.x;
			int cy = cur.y;
			
			for (int i = 0; i < 4; i++) {
				int mx = cx+xx[i];
				int my = cy+yy[i];
				
				if(mx >= 0 && my >= 0 && n > mx && m > my && !visit[mx][my]) {
					if(arr[mx][my] == 1) {
						cnt+=1;
						visit[mx][my] = true;
						q.add(new Node(mx,my));
					}
				}
			}
		}
		maxLeng = Math.max(maxLeng, cnt);
		res+=1;
		
	}
}
