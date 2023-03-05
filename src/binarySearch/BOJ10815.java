package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;



public class BOJ10815 {
	
	static int n,m,res;
	static Set<Integer> set ;
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		while(true) {

			if(n == 0 && m == 0) {
				break;
			}
			res = 0;
			set = new HashSet<Integer>();
			
			for (int i = 0; i < n+m; i++) {
				if(!set.add(Integer.parseInt(br.readLine()))) {
					res++;
				}
			}
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			System.out.println(res);
		}
	}
}
