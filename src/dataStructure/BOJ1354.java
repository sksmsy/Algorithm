package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1354 {

	static long n;
	static long p,q,x,y;
	static Map<Long, Long> map = new HashMap<Long, Long>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Long.parseLong(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		System.out.println(fn(n));
	}
	
	public static long fn(long num) {
		
		if(num <= 0) return 1;
		if(map.containsKey(num)) return map.get(num);
		map.put(num, fn((num/p)-x)+fn((num/q)-y));
		return map.get(num);
	}
}
