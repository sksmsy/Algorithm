package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2720 {
	public static void main(String[] args) throws IOException {
		int t;
		int[] ch = {25, 10, 5, 1};
		int res[];
		StringBuilder sb  = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			
			int m = Integer.parseInt(br.readLine());
			res = new int[4];
			int j = 0;
			while(m > 0) {
				int k = m / ch[j];
				res[j] = k;
				m %= ch[j++];
			}
			
			for (int j2 = 0; j2 < res.length; j2++) {
				sb.append(res[j2]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
