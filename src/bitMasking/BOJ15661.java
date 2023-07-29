package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15661 {

	static int n;
	static int arr[][];
	static boolean visit[];
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visit = new boolean[n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		com(0,0);
		System.out.println(min);
		
	}
	
	public static void com(int idx, int cnt) {
		if(cnt == n/2) {
			
			fn();
			return;
		}
		
		for (int i = idx; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				com(i+1, cnt+1);
				visit[i] = false;
			}
		}
	}
	
	public static void fn() {
		int teamStart = 0;
		int teamLink = 0;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j <n; j++) {
				if(visit[i] == true && visit[j] == true) {
					teamStart += arr[i][j];
					teamStart += arr[j][i];
				}
				else if(visit[i] == false && visit[j] == false) {
					teamLink += arr[i][j];
					teamLink += arr[j][i];
				}
			}
		}
		
		int val = Math.abs(teamStart - teamLink);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		min = Math.min(val, min);
	}
}
