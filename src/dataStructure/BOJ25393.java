package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ25393 {

	static int n,q;
	static HashMap<Integer, TreeSet<Integer>> left = new HashMap<>();
	static HashMap<Integer, TreeSet<Integer>> right = new HashMap<>();
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
		
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			if(!left.containsKey(l)) {
				left.put(l, new TreeSet<>());
			}
			left.get(l).add(r);
			if(!right.containsKey(r)) {
				right.put(r, new TreeSet<>());
			}
			right.get(r).add(l);
		}
		
		q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			sb.append(fn(l,r)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int fn(int l, int r) {
		if(!left.containsKey(l) || !right.containsKey(r)) {
			return -1;
		}
		
		Integer tmp = left.get(l).ceiling(r);
		
		if(tmp == null) {
			return -1;
		}else if(tmp == r) {
			return 1;
		}
		
		tmp = right.get(r).floor(l);
		if(tmp == null) {
			return -1;
		}
		return 2;
	}
	
}
