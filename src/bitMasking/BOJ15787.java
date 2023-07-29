package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15787 {
	
	static int n,m,cnt;
	static int log[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		log = new int[n+1];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int typ = Integer.parseInt(st.nextToken());
			int idx,pos;
			
			if(typ == 1 || typ == 2) {
				idx = Integer.parseInt(st.nextToken());
				pos = Integer.parseInt(st.nextToken())-1;
			}else {
				idx = Integer.parseInt(st.nextToken());
				pos = 0;
			}
			fn(typ,idx,pos);
		}
		
		
//		for (int i = 0; i < log.length; i++) {
//
//			System.out.println(log[i]+" : "+Integer.toBinaryString(log[i]));
//
//		}
		cnt = 1;
		
		Set<Integer> set = new HashSet<>();
		set.add(log[1]);
		for (int i = 1; i <= n; i++) {
			
			if(!set.contains(log[i])) {
				set.add(log[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void fn(int typ, int idx, int pos) {	
		int bit = 0;
		if(typ == 1) {
			bit = log[idx];
			bit |=(1<<pos);
			log[idx] = bit;
		}else if(typ == 2) {
			bit = log[idx];
			bit &= ~(1<<pos);
			log[idx] = bit;
		}else if(typ == 3) {
			bit = log[idx];
			bit &= ~(1 << 19);
			bit <<= 1;
			log[idx] = bit;
		}else {
			bit = log[idx];
			bit = (bit >> 1);
			log[idx] = bit;			
		}
	}
}
