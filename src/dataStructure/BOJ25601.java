package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ25601 {

	static HashMap<String, ArrayList<String>> mapList;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		mapList = new HashMap<>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n-1; i++) {
			st= new StringTokenizer(br.readLine());
			
			String a = st.nextToken();
			String b = st.nextToken();
			
			if(!mapList.containsKey(a)) {
				mapList.put(a, new ArrayList<>());
			}
			mapList.get(a).add(b);
		}
		st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		String b = st.nextToken();
		
		System.out.println(fn(a,b) || fn(b,a) ? 1:0);
	}
	
	public static boolean fn(String cur, String end) {
		if(cur.equals(end)) return true;
		
		if(mapList.get(cur) == null) return false;
		
		for (String next : mapList.get(cur)) {
			if(fn(next,end)) return true;
		}
		return false;
	}
}
