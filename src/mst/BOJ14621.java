package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ14621 {

	static int n,m,res;
	static boolean type[];
	static List<Node> list[];
	
	public static class Node implements Comparable<Node>{
		
		int to;
		int cost;
		boolean type;
		
		public Node(int to, int cost, boolean type) {
			this.to = to;
			this.cost = cost;
			this.type = type;
		}
		
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		type = new boolean[n];
		list = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			type[i] = "M".equals(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b, c, type[b]));
			list[b].add(new Node(a, c, type[a]));
		}
		prim();
		
		System.out.println(res);
		
	}
	
	public static void prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int cnt = 0;
		pq.add(new Node(0,0,type[0]));
		
		boolean visit[] = new boolean[n];
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			int cost = node.cost;
			boolean type = node.type;
			
			if(visit[cur]) continue;
			visit[cur] = true;
			
			res+=cost;
			
			if(++cnt == n) return;
			
			
			for (Node n : list[cur]) {
				
				if(!visit[n.to] && (type != n.type)) {
					pq.add(n);
				}
			}
			
		}
		res = -1;
	}
}
