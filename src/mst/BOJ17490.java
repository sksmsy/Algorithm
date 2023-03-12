package mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17490 {

	
	static int n,m;
	static long k;
	static int parent[],stone[];
	static boolean chk[];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Long.parseLong(st.nextToken());
		
		parent = new int[n+1];
		stone = new int[n+1];
		chk = new boolean[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n+1; i++) {
			parent[i] = i;
			stone[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			chk[end] = true;
		}
		
		
		make();
		System.out.println(fn());
		
		
	}
	
	public static void make() {
		for (int i = 1; i < n+1; i++) {
			int v = (i+1) % (n+1);
			if(v == 0) v= 1;
			if(find(i) != find(v)) {
				if(chk[v]) continue;
				union(i,v);
			}
			
		}
	}
	
	
	public static int find(int node) {
		if(parent[node] == node) {
			return node;
		}
		return find(parent[node]);
	}
	
	public static void union(int u, int v) {
		u = find(u);
		v = find(v);
		
		if(stone[u] <= stone[v]) {
			parent[v] = u;
		}else {
			parent[u] = v;
		}
	}
	
	public static String fn() {
		long cost = 0;
		int cnt = 0;
		
		for (int i = 1; i < n+1; i++) {
			if(find(i) == i) {
				cost += stone[i];
				cnt++;
			}
		}
		
		if(cost <= k || cnt <= 1) {
			return "YES";
		}else {
			return "NO";
		}
	}
	
}
