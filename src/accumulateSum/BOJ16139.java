package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16139 {
	public static void main(String[] args) throws IOException{
		
		String s;
		int t;
		char sum[];
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		s = br.readLine();
		
		t = Integer.parseInt(br.readLine());
		int ss = 0;
		int ee = 0;
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			ss = Integer.parseInt(st.nextToken());
			ee = Integer.parseInt(st.nextToken());
			
			String temp = s.substring(ss,ee+1);

			
			sb.append(cnt).append("\n");
		}
		
		
		System.out.println(sb);
		
	}
}
