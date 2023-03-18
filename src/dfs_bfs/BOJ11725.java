package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ11725 {

	static int n,arr[];
	static List<Integer> list[];
	static boolean visit[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		list = new ArrayList[n+1];
		visit = new boolean[n+1];
		arr = new int[n+1];
		for (int i = 0; i < n+1; i++) {
			list[i] = new ArrayList<Integer>();
		}	
		for (int i = 0; i <n-1; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1);
		
		for (int i = 2; i < n+1; i++) {
			 System.out.println(arr[i]);
		}
		
	}
	
	public static void dfs(int a) {
		visit[a] = true;
		for (int next : list[a]) {
			if(!visit[next]) {
				arr[next] = a;
				dfs(next);
			}
		}
	}
}
