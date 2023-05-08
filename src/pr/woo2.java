package pr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

import pr.woo.Node;

public class woo2 {
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

		int net[][] = {{1,2},{3,5},{4,2},{5,6}};
		int re[][] = {{3,2,10},{5,4,15}};
		int n = 6;
		
		List<Node> list[] = new ArrayList[n+1];
		int dist[] = new int[n+1];
		
		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < net.length; i++) {
			int start = net[i][0];
			int end = net[i][1];
			
			list[start].add(new Node(end,0));
			list[end].add(new Node(start,0));
			
		}
		
		for (int i = 0; i < re.length; i++) {
			int start = re[i][0];
			int end = re[i][1];
			int cost = re[i][2];
			
			list[start].add(new Node(end,cost));
			list[end].add(new Node(start,cost));
		}
		System.out.println(prim(list,dist,n));
		

		
		
		prim(list,dist,n);
		
		
	}
	
	public static int prim(List<Node>[] list, int[] dist, int N) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int res=0;
	
		pq.add(new Node(1,0));
		
		boolean visit[] = new boolean[N+1];
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			long cost = node.cost;
	
			if(visit[cur]) continue;
			visit[cur] = true;
			res += cost;
			
			
			for (Node n : list[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
			
			if(cur == N) return res;
		}
		return -1;
	}
	
}
