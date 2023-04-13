package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ20157 {

	static int n,max;
	static Map<Double, Integer> map1[]; 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		map1 = new HashMap[4];
		for (int i = 0; i < 4; i++) {
			map1[i] = new HashMap<>();
		}
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			double y = Integer.parseInt(st.nextToken());
			
			double incl = y/x;
			int idx = 0;
			if(x > 0 && y < 0) idx = 1;
			if(x < 0 && y < 0) idx = 2;
			if(x < 0 && y > 0) idx = 3;
			
			
			map1[idx].put(incl, map1[idx].getOrDefault(incl, 0)+1);
			max = Math.max(max, map1[idx].get(incl));
		}
		
		System.out.println(max);
		
		
		
		
	}
	
}
