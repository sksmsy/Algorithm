package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1922 {

	static int n,m;
	static long res;
	static List<Node>[] list;
	
	public static class Node implements Comparable<Node>{
		
		int to;
		long cost;
		
		public Node(int to, long cost) {
			this.to = to;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Node o) {
			return Long.compare(cost, o.cost);
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		list = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
		StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			long c = Integer.parseInt(st.nextToken());
			
			
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		
		
		prim();
		sb.append(res);
		
		System.out.println(sb);
		
	}
	
	public static void prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int cnt = 0;
		pq.add(new Node(0,0));
		
		boolean visit[] = new boolean[n];
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			long cost = node.cost;
	
			if(visit[cur]) continue;
			visit[cur] = true;
			res += cost;
			
			if(++cnt==n) break;
			
			for (Node n : list[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
		}
	}
	
}
