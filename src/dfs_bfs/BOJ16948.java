package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ16948 {

	static int N,arr[][],r1,c1,r2,c2,res;
	static int mx[] = {-2,-2,0,0,2,2};
	static int my[] = {-1,1,-2,2,-1,1};
	static boolean visit[][];
	
	public static class Node{
		int x,y,cnt;
		
		public Node(int x, int y,int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		visit = new boolean[N][N];
		st = new StringTokenizer(br.readLine());
		
		r1 = Integer.parseInt(st.nextToken());
		c1 = Integer.parseInt(st.nextToken());
		r2 = Integer.parseInt(st.nextToken());
		c2 = Integer.parseInt(st.nextToken());
		
		res = - 1;
		fn(new Node(r1,c1,0));
		System.out.println(res);
	}
	
	public static void fn(Node n) {
		Queue<Node> q = new LinkedList<>();
		q.add(n);
		visit[n.x][n.y] = true;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			int cx = cur.x;
			int cy = cur.y;
			if(cx == r2 && cy ==c2) {
				res = cur.cnt;
				return;
			}
			
			for (int i = 0; i < 6; i++) {
				int xx = cx+mx[i];
				int yy = cy+my[i];
				
				
				if(xx >= 0 && yy >=0 && yy < N && xx < N &&!visit[xx][yy]) {
					q.add(new Node(xx,yy,cur.cnt+1));
					visit[xx][yy] = true;
					
				}
			}
			
			
		}
	}
}
