package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ7785 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Set<String> set = new HashSet<String>();
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String status = st.nextToken();
			
			if("enter".equals(status)) {
				set.add(name);
			}else if("leave".equals(status)) {
				set.remove(name);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		set.stream().sorted(Collections.reverseOrder()).forEach(s -> sb.append(s).append("\n") );
		System.out.println(sb);
	}
}
