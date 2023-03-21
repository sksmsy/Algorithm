package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ25757 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<String> set = new HashSet<String>();
		int n = Integer.parseInt(st.nextToken());
		String typ = st.nextToken();
		
		for (int i = 0; i < n; i++) {
			String name = br.readLine();
			
			if(!set.contains(name)) {
				set.add(name);
			}
		}
		int size = set.size();
		int result=0;
		if("Y".equals(typ)) {
			result = size;
		}else if("F".equals(typ)) {
			result = size/2;
		}else {
			result = size/3;
		}
		System.out.println(result);
	}
}
