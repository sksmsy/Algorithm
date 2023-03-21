package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1764 {
	
	static int n,m,cnt;
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb= new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			set.add(str);
		}
		cnt = 0;
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				cnt++;
				list.add(str);
			}
		}
		sb.append(cnt).append("\n");
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		System.out.println(sb);
	}
}
