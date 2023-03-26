package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ25957 {

	static int n,m;
	static Map<String, String> map = new HashMap<String, String>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			
			map.put(fn(word), word);
			
		}
		
		m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			String word = fn(st.nextToken());
			if(map.containsKey(word)) {
				sb.append(map.get(word)).append(" ");
			}
			
		}
		
		System.out.println(sb);
	}
	
	public static String fn(String p) {
		char ch[] = p.toCharArray();
		if(p.length() > 1) {
			Arrays.sort(ch,1,ch.length-1);
		}
		
		return String.valueOf(ch);
	}
}
