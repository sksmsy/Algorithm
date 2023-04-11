package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ16166 {

	static int n,des;
	static Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int size  = Integer.parseInt(st.nextToken());
			if(!map.containsKey(i+1)) {
				map.put(i+1, new ArrayList<>());
			}
			
			for (int j = 0; j < size; j++) {
				map.get(i+1).add(Integer.parseInt(st.nextToken()));
			}
		}
		
		des = Integer.parseInt(br.readLine());
		
		
		
		
	}
}
