package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2644 {

	static int n,m,h1,h2,cnt;
	static List<Integer>[] list;
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		h1 = Integer.parseInt(st.nextToken());
		h2 = Integer.parseInt(st.nextToken());
		
		m = Integer.parseInt(br.readLine());
		list = new List[n+1];
		
		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		cnt = 1;
		System.out.println(bfs(h1,h2));
	}
	
	public static int bfs(int start,int end) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		int visit[] = new int[n+1];
		Arrays.fill(visit, -1);
		visit[start] = 0;
		q.add(start);
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			if(cur == end) return visit[cur];
			cnt++;
			for (int i = 0; i < list[cur].size(); i++) {
				int tmp = list[cur].get(i);
				
				if(visit[tmp] != -1) continue;
				visit[tmp] = visit[cur]+1;
				q.add(tmp);
			}
			
		}
		return -1;
	}
}
