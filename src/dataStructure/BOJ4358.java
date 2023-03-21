package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ4358 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		String wood = "";
		int cnt = 0;
		while(true) {
			wood = br.readLine();
			
			if(wood == null ||"".equals(wood)) break;
			
			map.put(wood, map.getOrDefault(wood, 0)+1);
			
			cnt++;
		}
		
		
		
		List<String> keySet = new ArrayList<String>(map.keySet());
		
		Collections.sort(keySet);
		for (int i = 0; i < keySet.size(); i++) {
			String name = keySet.get(i);
			float p = (map.get(name)/(float)cnt)*100;
			String value = String.format("%.4f", p);
			
			sb.append(name).append(" ").append(value).append("\n");
		}
		System.out.println(sb);
	}
}
