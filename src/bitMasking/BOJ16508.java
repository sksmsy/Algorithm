package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16508 {

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String target = st.nextToken();
		int n = Integer.parseInt(br.readLine());
		
		String title[] = new String[n];
		int cost[] = new int[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			cost[i] = Integer.parseInt(st.nextToken());
			title[i] = st.nextToken();
		}
		
		//조합
		int total = 1 << n;
		System.out.println(Integer.toBinaryString(total));
		int result = -1;
		
		for(int i = 1; i < total; i++) {
			int[] cnt = new int[26];
			int sum = 0;
			
			
			for(int j = 0; j< n; j++) {
				
				if((i & (1 << j)) > 0) {
					System.out.println(i & (1 << j));
					
					String b = title[j];
					for(int k=0; k<b.length(); k++) {
						cnt[b.charAt(k)- 'A']++;
					}
					
					sum += cost[j];
				}
			}
			
			if(chk(cnt,target)) {
				if(result == -1) result = sum;
				else result = Math.min(result, sum);
			}
		}
		
		System.out.println(result);
	}
	
	public static boolean chk(int[] cnt, String target) {
		for(int i = 0; i<target.length(); i++) {
			if(cnt[target.charAt(i) -'A'] == 0) return false;
			cnt[target.charAt(i)-'A']--;
		}
		return true; 
	}
}
