package review.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260 {
	static int n,m,v,arr[][];
	static boolean visit[];
	
	static Queue<Integer> q = new LinkedList<Integer>();
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(v);
		sb.append("\n");
		visit = new boolean[n+1];

		bfs(v);
		System.out.println(sb);
	}
	
	
	public static void dfs(int start) {
		visit[start] = true;
		sb.append(start + " ");
		
		for (int i = start; i <=n; i++) {
			if(arr[start][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int start) {
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			start = q.poll();
			sb.append(start + " ");
			
			for (int i = 0; i <= n; i++) {
				if(arr[start][i] == 1 && !visit[i]) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
		
	}
	
}
