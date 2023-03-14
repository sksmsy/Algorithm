package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class BOJ14284 {
	
	static int n,m,s,t,dist[];
	static int INF = 100_000_000+1;
	static List<Node> list[];
	
	public static class Node implements Comparable<Node>{
		int to;
		int cost;
		
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		dist = new int[n+1];
		list = new ArrayList[n+1];
		Arrays.fill(dist, INF);

		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list[start].add(new Node(end,cost));
			list[end].add(new Node(start,cost));
		}
		
		st= new StringTokenizer(br.readLine());
		s= Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		
		dijkstra();
		System.out.println(dist[t]);
		
		
	}
	public static void dijkstra() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean visit[] = new boolean[n+1];
		pq.add(new Node(s,0));
		dist[0] = dist[s] = 0;
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.to;
			
			if(cur == t) {
				return;
			}
			
			if(visit[cur] == true) continue;
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
