package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1351 {
	
	static int p,q;
	static Map<Long, Long> map = new HashMap<Long, Long>();
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		//dp = new long[(int) n+1];
		
		//dp[0] = 1;
		
		System.out.println(fn(n));
	}
	
	public static long fn(long x) {
		
		if(x == 0) return 1;
		if(map.containsKey(x)) return map.get(x);
		
		map.put(x, fn(x/p)+fn(x/q));
		return map.get(x);
	}
}
