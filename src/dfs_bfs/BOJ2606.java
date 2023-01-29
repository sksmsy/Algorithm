package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ2606 {

	static int node,line;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static boolean[] visit;
	static int cnt = 0;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		visit = new boolean[node+1];
		
		for (int i = 0; i <= node; i++) {
			
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		dfs(1);
		System.out.println(cnt);
	}
	
	private static void dfs(int start) {
		
		visit[start] = true;
		
		for (int i = 0; i < list.get(start).size(); i++) {
			int y = list.get(start).get(i);
			if(!visit[y]) {
				visit[y] = true;
				cnt++;
				dfs(y);
			}
		}
	}
	

}
