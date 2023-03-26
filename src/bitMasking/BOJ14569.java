package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14569 {

	static int n,m;
	static long arr[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		arr = new long[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			
			long sched = 0;
			
			for (int j = 0; j < k; j++) {
				int time = Integer.parseInt(st.nextToken())-1;
				sched |= (1L << time);
			}
			arr[i] = sched;
		}
		
		m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			long sched = 0;
			for (int j = 0; j < k; j++) {
				int time = Integer.parseInt(st.nextToken())-1;
				
				sched |= 1L << time;
				
			}
			
			int result = 0;
			for (int j = 0; j < n; j++) {
				if((arr[j] | sched) == sched) {
					result++;
				}
			}
			sb.append(result).append("\n");
			
		}
		System.out.println(sb);
		
	}
}
