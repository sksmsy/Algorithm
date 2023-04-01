package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ17396 {

	static int n,m,sight[];
	static long dist[];
	static List<Node>[] list;
	
	public static class Node implements Comparable<Node>{
		int to;
		long cost;
		
		public Node(int to, long cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			if(this.cost-o.cost > 0) return 1;
			else return -1;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		dist = new long[n];
		list = new ArrayList[n];
		sight = new int[n];
		
		Arrays.fill(dist, Long.MAX_VALUE);
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			sight[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		dijk();
		
		if(dist[n-1] == Long.MAX_VALUE) System.out.println(-1);
		else System.out.println(dist[n-1]);
		
	}
	
	public static void dijk() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean visit[] = new boolean[n];
		dist[0] = 0;
		pq.add(new Node(0,0));
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			long curCost = node.cost;
			
			if(cur == n) {
				return;
			}
			
			if(visit[cur]|| sight[cur] == 1) continue;
			visit[cur] = true;
			
			for (Node next : list[cur]) {
				if(next.to != n-1 && sight[next.to] == 1) continue;
					
					if(dist[next.to] > dist[cur]+next.cost) {
						dist[next.to] = dist[cur]+next.cost;
						pq.add(new Node(next.to, dist[next.to]));
					}
			}
			
		}
	}
}
