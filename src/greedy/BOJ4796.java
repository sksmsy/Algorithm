package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4796 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l, p, v;
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int i = 1;
		while(true) {
			int res = 0;
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			if(l == 0) break;
			
			
			res =  l * (v/p) + Math.min(l, (v%p));
			
			sb.append("Case "+i+": "+res+"\n");
			i++;
		}
		System.out.println(sb);
	}
}
