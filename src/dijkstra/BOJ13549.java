package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ13549 {

	static int n,k,dist[];
	static List<Node> list;
	
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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
	
		dist = new int[100001];
		Arrays.fill(dist, 10000001);
		dijk(n,k);
		System.out.println(dist[k]);
	}
	
	public static void dijk(int start, int end) {
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(start,0));
		boolean visit[] = new boolean[100001];
		dist[start] = 0;
		
		
		while(!pq.isEmpty()) {
			Node node = pq.poll();
			int cur = node.to;
			int cost = node.cost;
			
			if(cur == end) {
				return;
			}
			
			if(visit[cur]) {
				continue;
			}
			visit[cur] = true;
			
			int back = cur+1;
			int front = cur-1;
			int tel = cur*2;
			
			if(back <= 100000 && !visit[back]) {
				if(dist[back] > cost+1) {
					dist[back] = cost+1;
					pq.add(new Node(back,cost+1));
				}
			}
			
			if(tel <= 100000 && !visit[tel]) {
				if(dist[tel] > cost) {
					dist[tel] = cost;
					pq.add(new Node(tel,cost));
				}
			}
			if(front >= 0 && !visit[front]) {
				if(dist[front] > cost+1) {
					dist[front] = cost + 1;
					pq.add(new Node(front,cost+1));
				}
			}
		}
	}
}
