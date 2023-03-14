package dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1446 {
	
	static int n,d,dist[],res;
	static int INF = 10001;
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
		d = Integer.parseInt(st.nextToken());
		
		dist = new int[INF];
		list = new ArrayList[INF];
		for (int i = 0; i < list.length; i++) {
			dist[i] = i;
			list[i] = new ArrayList<>();
		}
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			list[start].add(new Node(end,cost));
		}
		
		
	}
	
	public static void dijkstra(int start) {
		if(start >d) {
			return;
		}
		if(dist[start+1]>dist[start]+1) {
			dist[start+1] = dist[start]+1;
		}
		
		for (int i = 0; i < list[start].size(); i++) {
		}
	}
}
