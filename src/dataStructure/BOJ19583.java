package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ19583 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String s = st.nextToken();
		String e = st.nextToken();
		String q = st.nextToken();
		
		
		HashSet<String> start = new HashSet<String>();
		HashSet<String> end = new HashSet<String>();
		
		
		String value = br.readLine();
		
		while(value!=null && !value.isEmpty()) {
			st = new StringTokenizer(value, " ");
			String time = st.nextToken();
			String name = st.nextToken();
			
			
			if(time.compareTo(s)<=0) {
				start.add(name);
			}else if(time.compareTo(e) >= 0 &&
					  time.compareTo(q) <= 0) {
				end.add(name);
			}
			
			value = br.readLine();
		}
		
		int cnt= 0;
		for (String name : start) {
			if(end.contains(name)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
