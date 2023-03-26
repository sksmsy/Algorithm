package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ9079 {

	static int t,arr[];
	static boolean visit[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			arr = new int[8];
			visit = new boolean[512];
			
			int start = 0;
			for (int i = 0; i < 3; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++) {
					start *=2;
					if(st.nextToken().equals("H")) start++;
				}
				
			}
			visit[start] = true;
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(start);
			int result = 0;
			
			boolean finish = false;
			
			while(!q.isEmpty()) {
				Queue<Integer> tempQ = new LinkedList<Integer>();
				while(!q.isEmpty()) {
					tempQ.add(q.poll());
				}
				
				while(!tempQ.isEmpty()) {
					int cur = tempQ.peek();
					if(cur == 511 || cur == 0) {
						finish = true;
						break;
					}
					tempQ.poll();
					find(cur);
					
					for (int i = 0; i < 8; i++) {
						if(!visit[arr[i]]) {
							visit[arr[i]] = true;
							q.add(arr[i]);
						}
					}
				}
				if(finish)break;
				result++;
			}
			if(!finish) result = -1;
			System.out.println(result);
			
		}
	}
	
	public static void find(int start) {
		
	}
}
