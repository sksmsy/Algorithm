package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ25325 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String name[] = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			name[i] = st.nextToken();
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < n; i++) {
			map.put(name[i], 0);
		}
		
		for (int i = 0; i <n ;i++) {
			st = new StringTokenizer(br.readLine());
			
			int size = st.countTokens();
			for (int j = 0; j < size; j++) {
				String target = st.nextToken();
				map.put(target, map.get(target)+1);
			}
			
		}
		
		List<String> keySet = new ArrayList<String>(map.keySet());
		
		keySet.sort((o1,o2) -> map.get(o2).compareTo(map.get(o1)));
		
		for (String key : keySet) {
			sb.append(key).append(" ").append(map.get(key)).append("\n");
		}
		
		System.out.println(sb);
	}
}
