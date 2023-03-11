package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class BOJ13905 {

	static int n,m,s,e,min;
	static List<Node>[] list;

	public static class Node implements Comparable<Node>{
		int to;
		int cost;
		
		public Node(int to,int cost){
			this.to = to;
			this.cost = cost;
			
		}
		@Override
		public int compareTo(Node o) {
			return o.cost-this.cost;
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int c = Integer.parseInt(st.nextToken());
			
			list[a].add(new Node(b,c));
			list[b].add(new Node(a,c));
		}
		min = Integer.MAX_VALUE;
		prim();
		
		sb.append(min);
		
		System.out.println(sb);
	}
	
	public static void prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int cnt = 0;
		boolean visit[] = new boolean[n];
		pq.add(new Node(s-1,Integer.MAX_VALUE));
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			int cost = node.cost;
			
			if(visit[cur]) continue;
			min = Math.min(min, cost);
			
			
			visit[cur] = true;
			
			if(cur == e-1) return;
			if(++cnt == n) return;
			
			for (Node n : list[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
		}
		if(cnt != n) {
			min = 0;
		}
		
		
	}
}
