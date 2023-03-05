package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ10816 {
	
	static int n,m,arr[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			map.put(k, map.getOrDefault(k, 0)+1);
		}
		
		m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(!map.containsKey(k)) {
				sb.append(0).append(" ");
			}else {
				sb.append(map.get(k)).append(" ");
			}
		}
		System.out.println(sb);
		
	}
}
