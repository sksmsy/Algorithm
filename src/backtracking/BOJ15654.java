package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15654 {

	static int n,m,arr[];
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visit = new boolean[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
	}
	
	public static void fn(int arr[],int start) {
		if(!visit[start]) {
			
		}
		
		
		
	}
	
	
}
