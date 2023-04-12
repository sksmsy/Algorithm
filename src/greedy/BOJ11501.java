package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11501 {

	static int t,n,arr[];
	static long max;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			n = Integer.parseInt(br.readLine());
			
			arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long tmp = 0;
			max = 0;
			for (int i = n-1; i >= 0; i--) {
				if(arr[i] > max) {
					max = arr[i];
				}else {
					tmp += max-arr[i];
				}
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
}
