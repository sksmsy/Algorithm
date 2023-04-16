package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1966 {

	static int t,n,m,arr[];
	static Map<Integer, Integer>map = new HashMap<>();
	static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			arr = new int[n];
			int max = 0;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				//idx,value
				map.put(i, arr[i]);
				max = Math.max(max, arr[i]);
			}
			
			int i = 0;
			while(true) {
				if(i == n) break;
				if(max == arr[i]) {
					q.add(i);
					i = 0;
					max--;
				}else {
					i++;
				}
			}
			for (int j = 0; j < q.size(); j++) {
				int idx = q.peek();
				if(map.get(m) == idx) {
					sb.append(j+1).append("\n");
					break;
				}
			}
			
		}
		System.out.println(sb);
	}
}
