package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class BOJ13414 {

	static int k,l;
	static LinkedHashSet<String> set = new LinkedHashSet<>();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		k = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < l; i++) {
			String str = br.readLine();
			
			if(set.contains(str)) {
				set.remove(str);
			}
			set.add(str);
		}
		int cnt = 0;
		for (String str : set) {
			if(cnt ==k) break;
			sb.append(str).append("\n");

			cnt++;
		}
		
		System.out.println(sb);
	}
}
