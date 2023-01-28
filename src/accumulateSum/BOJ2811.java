package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2811 {

	public static void main(String[] args) throws IOException {
		
		int n,arr[],sum[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		sum = new int[n];
		boolean bl[] = new boolean[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp < 0 ) {
				arr[i] = tmp;
				bl[i] = true;
			}
		}
		
		int res,cnt = 0,max = 0;
		for (int i = 0; i < n; i++) {
			if(bl[i]) {
				
				
				for (int j = i; j < n; j++) {
					if(!bl[i]) {
						cnt++;
						return;
					}
				}
			
			max = Math.max(max,cnt);
			cnt = 0;
			}
		}
		
		System.out.println(max);
		
		
		
		
		
		
		
	}
}
