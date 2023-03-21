package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ20438 {

	static int n,k,q,m,s,e;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		boolean[] visit = new boolean[n+3];
		List<Integer> list = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < q; i++) {
			int now = Integer.parseInt(st.nextToken());
			if(list.contains(now)) continue;
			
			if(!visit[now]) {
				for (int j = now; j < n+3; j++) {
					if(j% now == 0) {
						if(!list.contains(j)) {
							visit[j] = true;
						}
					}
				}
			}
		}
		
		int sum[] = new int[n+3];
		for (int i = 3; i < sum.length; i++) {
			sum[i] = sum[i-1] + ((!visit[i]) ? 1: 0);
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			System.out.println(sum[e]-sum[s-1]);
		}
		
		
	}
}
