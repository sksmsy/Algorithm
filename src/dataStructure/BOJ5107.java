package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ5107 {

	static HashMap<String, ArrayList<String>> mapList;
	static HashMap<String, String> visit;
	static int cnt;
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		while(true) {
			if(n == 0) break;
			
			mapList = new HashMap<String, ArrayList<String>>(); 
			visit = new HashMap<String, String>();
		
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				String a = st.nextToken();
				String b = st.nextToken();
				
				visit.put(a, "false");
				
				if(!mapList.containsKey(a)) {
					mapList.get(a).add(b);
				}
			}
			
			n = Integer.parseInt(br.readLine());
			
		}
	}
	public static void fn(String cur,String end) {
		if(mapList.get(cur) == null) return;

		
		

	}
	
	
}
