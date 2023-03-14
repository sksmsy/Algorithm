package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ18352 {

	
	static int n,m,k,x,dist[],res;
	static int INF = 300001;
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
		k = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n+1];
		dist = new int[n+1];
		
		Arrays.fill(dist, INF);
		
		for (int i = 1; i <= n ; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list[start].add(new Node(end,1));
		}
		dijkstra(x);
		
		
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if(dist[i] == k) {
				System.out.println(i);
				cnt=1;
			}
		}
		
		if(cnt== 0) {
			System.out.println(-1);
		}
	}
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean visit[] = new boolean[n+1];
		pq.add(new Node(start, 0));
		dist[start]=0;
		
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.to;
			int cost = curNode.cost;
			
			
			if(visit[cur] == true)continue;
			visit[cur] = true;
			
			
			for (Node nextNode : list[cur]) {
				if(dist[nextNode.to] > nextNode.cost + cost) {
					dist[nextNode.to] = nextNode.cost + cost;
					pq.add(new Node(nextNode.to,dist[nextNode.to]));
				}
				
			}
		}
	}
}
