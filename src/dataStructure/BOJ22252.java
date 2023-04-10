package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ22252 {

	static int q;
	static long tot;
	static Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		q = Integer.parseInt(br.readLine());
		tot = 0;
		while(q-- > 0) {
			st = new StringTokenizer(br.readLine());
			
			int typ = Integer.parseInt(st.nextToken());
			String nm = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			
			
			if(typ == 1) {
				if(!map.containsKey(nm)) {
					map.put(nm, new ArrayList<Integer>());
				}		
				for (int i = 0; i < k; i++) {
					map.get(nm).add(Integer.parseInt(st.nextToken()));
				}
				
				Collections.sort(map.get(nm),Collections.reverseOrder());
			}else {
				
				if(map.containsKey(nm)) {
					int size = map.get(nm).size();
					for (int i = 0; i < k; i++) {
						if(size <= i)break;
						tot += map.get(nm).get(0);
						map.get(nm).remove(0);
					}
					
				}
			}
			
		}
		System.out.println(tot);
		
	}
}
