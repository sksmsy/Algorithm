package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ6566 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, ArrayList<String>> grpMap = new HashMap<>();
		List<String> list = new ArrayList<String>();
		List<String> sortedList = new ArrayList<String>();
		while(true) {
			String str = br.readLine();
			
			if(str == null || str.equals("")) break;
			
			list.add(str);
		}
		
			
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			String[] arr = s.split("");
			Arrays.sort(arr);
			
			String sortedStr = String.join("", arr);
			if(!grpMap.containsKey(sortedStr)) {
				grpMap.put(sortedStr, new ArrayList<>());
			}
			grpMap.get(sortedStr).add(s);
			if(!sortedList.contains(sortedStr)){
				sortedList.add(sortedStr);
			}
			for (int j = 0; j < list.size(); j++) {
				if(i == j) continue;
				String s2 = list.get(j);
				String[] arr2 = s2.split(s2);
				Arrays.sort(arr2);
				
				if(arr == arr2) {
					grpMap.get(sortedStr).add(s2);
				}
			}
		}
		for (int i = 0; i < grpMap.size(); i++) {
		}
		
		int size = -1;
		for (String s : sortedList) {
			Collections.sort(grpMap.get(s));
		}
		System.out.println(sb);
		
	}
	
}
