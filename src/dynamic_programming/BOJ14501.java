package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501 {
	
	static int n,t[],p[],dp[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		t = new int[n];
		p = new int[n];
		
		
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		//N일에 얻을수 있는 최대 수익
		dp = new int[n+1];
		
		
		//점화식
		//현재 날짜에서 소요 시간과 비용을 더해 dp에 저장한다.
		//이후, 중복될 때 최대값을 넣는다.
		//dp[i + t[i]] = max(dp[i + t[i]], dp[i] + p[i]);
		for (int i = 0; i < n; i++) {
			if(i + t[i] <= n) {
				dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]);
			}
			
			//현재 경우의 수가 0일 수 있기 때문에 이전의 최대값을 넣어줌.
			//해당 날짜에 일할 수 없다면, 이전까지 일한 최대 수당을 넣어주어야 한다.
			dp[i+1] = Math.max(dp[i+1], dp[i]);
			
		}
		System.out.println(dp[n]);
	}
}
