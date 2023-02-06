package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String b = br.readLine();

		int cnt = 0;
		for (int i = 0; i < b.length(); i++) {
			
			if(b.charAt(i) == 'X') {
				cnt++;
			}else {
				if(cnt % 2!=0) {
					System.out.println(-1);
					return;
				}else {
					int k = cnt / 4;
					
					for (int j = 0; j < k; j++) {
						sb.append("AAAA");
					}
					if(cnt % 4 != 0) {
						sb.append("BB");
					}
					
					sb.append(".");
					cnt = 0;
				}
			}
			
		}
		if(cnt % 2 !=0) {
			System.out.println(-1);
			return;
		}else {
			int k = cnt / 4;
			
			for (int j = 0; j < k; j++) {
				sb.append("AAAA");
			}
			if(cnt % 4 != 0) {
				sb.append("BB");
			}
			cnt = 0;
		}
		
		System.out.println(sb);
	}
}
