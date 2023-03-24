package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ22233 {	
	
	static int n,m;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine(), ",");
			
			while(true) {
				if(st.countTokens() == 0) break;
				String str = st.nextToken();
				if(set.contains(str)) {
					set.remove(str);
				}
				
			}
			sb.append(set.size()).append("\n");
			
		}
		System.out.println(sb);
		
		
	}
}
