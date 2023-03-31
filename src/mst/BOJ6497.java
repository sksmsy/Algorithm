package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ6497 {

	public static int m,n,res,totCost;
	public static List<Node>[] list;
	
	public static class Node implements Comparable<Node>{
		int to;
		int cost;
		
		public Node(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Node o) {
			return Integer.compare(cost, o.cost);
		}
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			if(m == 0 && n == 0) break;
			
			list = new ArrayList[m];
			res = totCost = 0;
			
			
			for (int i = 0; i < m; i++) {
				list[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				list[a].add(new Node(b, c));
				list[b].add(new Node(a, c));
				totCost +=c;
			}
			
			prim();
		
			System.out.println(totCost -res);
		}
	}
	
	public static void prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int cnt = 0;
		
		pq.add(new Node(0,0));
		boolean visit[] = new boolean[m];
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			int cost = node.cost;
			
			if(visit[cur]) continue;
			visit[cur] = true;
			res += cost;
			
			if(++cnt == m)break;
			for (Node n : list[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
		}
	}
}
