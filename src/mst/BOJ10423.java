package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ10423 {
	
	static int n,m,k,res;
	static List<Node> list[];
	
	public static class Node implements Comparable<Node>{
	
		int to;
		int cost;
		
		public Node(int to , int cost) {
			this.to = to;
			this.cost = cost;
		}
		
		public int compareTo(Node o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		
	}
}
