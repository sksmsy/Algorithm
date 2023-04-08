package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BOJ2667 {

	static int n,arr[][],bCnt,cnt;
	static boolean visit[][];
	static int mx[] = {-1,0,1,0};
	static int my[] = {0,-1,0,1};
	static List<Integer> list = new ArrayList<Integer>();
	
	public static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visit = new boolean[n][n];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(!visit[i][j] && arr[i][j] == '1') {
					visit[i][j] = true;
					bfs(new Node(i,j));
				}
				
			}
		}
		sb.append(list.size()).append("\n");
		Collections.sort(list);
		for (int c : list) {
			sb.append(c).append("\n");
			
		}
		System.out.println(sb);
	}
	
	public static void bfs(Node o) {
		Queue<Node> q = new LinkedList<>();
		q.add(o);
		cnt = 1;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int xx = cur.x + mx[i];
				int yy = cur.y + my[i];
				
				if(xx<0 || yy<0 || xx>=n || yy>=n) {
					continue;
				}
				if(visit[xx][yy]) {
					continue;
				}
				
				if(arr[xx][yy] == '1') {
					visit[xx][yy] = true;
					q.add(new Node(xx,yy));
					cnt++;
				}
				
			}
			
		}
		list.add(cnt);
	}
}
