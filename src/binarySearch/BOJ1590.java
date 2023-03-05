package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1590 {
	
	static int n,t,s,l,c,arr[],size;
	static int min;
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		t = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < n; i++) {
		
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			

			for (int j = 0; j < c; j++) {
				list.add(s+j*l);
			}
		}
		Collections.sort(list);
		size = list.size()-1;
		if(list.get(size) < t) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(fn(t));
	}
	
	public static int fn(int key) {
		
		int start = 0;
		int end = size;
		
		while(start <= end) {
			
			int mid = (start+end)/2;
			
			if(list.get(mid) < key) {
				start = mid + 1;
			}else {
				if(key == list.get(mid)) {
					return 0;
				}
				end = mid - 1;
			}
		}
		
		return list.get(start)-t;
		
	}
}
