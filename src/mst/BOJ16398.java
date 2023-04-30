package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ16398 {

	static int n;
	static List<Node>[] list;
	static long res;
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
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		list = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				list[i].add(new Node(j,Integer.parseInt(st.nextToken())));
			}
		}
		prim();
		System.out.println(res);
	}
	
	public static void prim() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0,0));
		
		boolean visit[] = new boolean[n];
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			long cost = node.cost;
			
			if(visit[cur]) continue;
			visit[cur] = true;
			res += cost;
			
			for (Node ne : list[cur]) {
				if(!visit[ne.to]) {
					pq.add(ne);
				}
			}
		}
	}
}
