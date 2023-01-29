package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ17390 {
	public static void main(String[] args)throws IOException {
		
		int n,q;
		int a[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		a = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		for (int i = 1; i < a.length; i++) {
			a[i] = a[i] + a[i-1];
		}
	
		int s,e;
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			
			sb.append(a[e]-a[s-1]).append("\n");
		
		}
		System.out.println(sb);
	}

}
