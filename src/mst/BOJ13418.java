package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class BOJ13418 {
	static int n,m,res,max,min;
	static List<Node1> list1[];
	static List<Node2> list2[];
	public static class Node1 implements Comparable<Node1>{
		int to;
		int cost;
		
		public Node1(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node1 o) {
			return this.cost - o.cost;
		}
	}
	public static class Node2 implements Comparable<Node2>{
		int to;
		int cost;
		
		public Node2(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node2 o) {
			return o.cost - this.cost;
		}
	}
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		list1 = new ArrayList[n+1];
		list2 = new ArrayList[n+1];
	
		
		for (int i = 0; i <=n; i++) {
			list1[i] = new ArrayList<>();
			list2[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < m+1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			list1[a].add(new Node1(b, c));
			list2[a].add(new Node2(b, c));
			list1[b].add(new Node1(a, c));
			list2[b].add(new Node2(a, c));
		}
		prim1();
		prim2();
		res = max-min;
		System.out.println(res);
		
	}
	
	public static void prim1() {
		int k = 0;
		PriorityQueue<Node1> pq = new PriorityQueue<>();
		int cnt = 0;
		boolean visit[] = new boolean[n+1];
		pq.add(list1[0].get(0));
		visit[0] = true;
		
		while (!pq.isEmpty()) {
			Node1 next = pq.poll();
			int cur = next.to;
			int cost = next.cost;
			
			if(visit[cur]) continue;
			visit[cur] = true;
			
			if(cost == 0) k++;
			if(++cnt == n)break;
			
			for (Node1 n : list1[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
		}
		max = k * k;
	}
	public static void prim2() {
		int k = 0;
		PriorityQueue<Node2> pq = new PriorityQueue<>();
		int cnt = 0;
		boolean visit[] = new boolean[n+1];
		pq.add(list2[0].get(0));
		visit[0] = true;
		
		while (!pq.isEmpty()) {
			Node2 next = pq.poll();
			int cur = next.to;
			int cost = next.cost;
			
			if(visit[cur]) continue;
			visit[cur] = true;
			
			if(cost == 0) k++;
			if(++cnt == n)break;
			
			for (Node2 n : list2[cur]) {
				if(!visit[n.to]) {
					pq.add(n);
				}
			}
		}
		min = k * k;
	}
	
}
