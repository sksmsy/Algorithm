package pr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class woo {

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

		int net[][] = {{1,2},{3,5},{4,2},{5,6}};
		int re[][] = {{3,2,10},{5,4,15}};
		int n = 6;
		//1,2 
		//2,3,10 / 3,1,12
		//4
		List<Node> list[] = new ArrayList[n+1];
		int dist[] = new int[n+1];
		
		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < net.length; i++) {
			int start = net[i][0];
			int end = net[i][1];
			
			list[start].add(new Node(end,100000));
			list[end].add(new Node(start,100000));
			
		}
		
		for (int i = 0; i < re.length; i++) {
			int start = re[i][0];
			int end = re[i][1];
			int cost = re[i][2];
			
			list[start].add(new Node(end,cost));
			list[end].add(new Node(start,cost));
		}
		System.out.println(dijkstra(list,dist,n));
		

	}
	
	public static int dijkstra(List<Node>[] list, int[] dist, int n) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		boolean visit[] = new boolean[n+1];
		pq.add(new Node(0, 0));
		dist[0] = dist[1]=dist[2]=0;
		int res = 0;
		int cnt = 0;
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			int cur = curNode.to;
			int cost = curNode.cost;
			
			System.out.println("cur : " + cur);
			System.out.println("co : " + cost);
			
			if(visit[cur] == true)continue;
			visit[cur] = true;
			res +=cost;
			cnt++;
			
			for (Node nextNode : list[cur]) {
				if(dist[nextNode.to] > nextNode.cost + cost) {
					dist[nextNode.to] = nextNode.cost + cost;
					pq.add(new Node(nextNode.to,dist[nextNode.to]));
				}
				
			}
			
			if(cur == n ) {
				return dist[n];
			}
		}
		System.out.println("res : "+res);
		for (int i = 0; i < dist.length; i++) {
			System.out.print(dist[i] + " ");
		}
		return -1;
	}
}
