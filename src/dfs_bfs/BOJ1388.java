package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1388 {

	static int n,m,cnt;
	static char arr[][];
	static boolean visit[][];
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new char[n][m];
		visit = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = str.charAt(j); 
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(visit[i][j]) continue;
				if(arr[i][j] == '-') fn(i,j,true); 
				else fn(i,j,false);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static void fn(int a, int b, boolean line) {
		visit[a][b] = true;
		if(line) {
			if(b+1 < m && arr[a][b+1] == '-')fn(a,b+1,true);
		}else{
			if(a+1 < n && arr[a+1][b] != '-')fn(a+1,b,false);
		}
	}
}
