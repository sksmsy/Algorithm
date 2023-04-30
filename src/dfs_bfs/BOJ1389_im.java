package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1389_im {

	static int n,m;
	static int dist[][];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		
		dist = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
			dist[i][i] = 0;
		}
		
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			
			dist[a][b] = 1;
			dist[b][a] = 1;
			
		}
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[j][i] == Integer.MAX_VALUE) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (dist[i][k] == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (dist[j][k] > dist[j][i] + dist[i][k]) {
                        dist[j][k] = dist[j][i] + dist[i][k];
                    }
                }
            }
        }

		int res = 0;
		int min = Integer.MAX_VALUE;
		int sum[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum[i] += dist[i][j];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(min > sum[i]) {
				min = sum[i];
				res = i;
			}
		}
		System.out.println(res+1);
	}
}
