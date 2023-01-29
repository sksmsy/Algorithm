package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ13023 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static boolean visit[];
	static int cnt = 0;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N+1];
		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<>());
		}
		
		for (int i = 0; i < M; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			list.get(a).add(b);
			list.get(b).add(a);
		}

		System.out.println(list);
		dfs(0);
		System.out.println(0);
	}
	
	private static void dfs(int start) {
		visit[start] = true;
		
		if(cnt == 4) {
			System.out.println(1);
			System.exit(0);
		}
		
		for (int i = 0; i < list.get(start).size(); i++) {
			int y = list.get(start).get(i);
			if(!visit[y]) {
				cnt++;
				dfs(y);
			}
		}
	}

}
