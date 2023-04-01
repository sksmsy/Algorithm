package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1916 {

	static int n,m,start,end,dist[];
	static int INF = 100_000_001;
	static List<Node>[] list;
	
	public static class Node implements Comparable<Node>{
		int to;
		int cost;
		
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return this.cost-o.cost;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n+1];
		dist = new int[n+1];
		Arrays.fill(dist, INF);

		for (int i = 0; i <= n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
		}
		st = new StringTokenizer(br.readLine());
		
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		dijk();
		System.out.println(dist[end]);
	}
	
	public static void dijk() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean visit[] = new boolean[n+1];
		dist[0] = dist[start] = 0;
		pq.add(new Node(start,0));
		
		while(!pq.isEmpty()) {
			
			Node curNode = pq.poll();
			int cur = curNode.to;
			
			if(cur==end)return;
			
			if(visit[cur])continue;
			visit[cur] = true;
			
			for (Node next : list[cur]) {
				if(dist[next.to] > dist[cur] + next.cost) {
					dist[next.to] = dist[cur] + next.cost;
					pq.add(new Node(next.to, dist[next.to]));
				}
				
			}
		}
	}
}
