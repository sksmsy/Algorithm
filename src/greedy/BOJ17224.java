package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * apc 
 * 
 * n: 문제의 개수
 * l: 역량 (같거나 이하 문제만 풀수있)
 * k: 해결가능문제
 * 둘째줄부터 n개의 줄에 걸쳐 쉬운거 sub1, 어려운거 sub2
 * 쉬운거 100점, 어려운거 140점
 * 
 */
public class BOJ17224 {

	public static void main(String[] args) throws IOException{
		
		int n,l,k;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
	
		
		
		int tot = 0;
		System.out.println(tot);
		
	}
}
