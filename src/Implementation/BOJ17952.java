package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17952 {
	
	static int n,res;
	
	public static class Tesk{
		int scr;
		int time;
		
		public Tesk(int scr , int time) {
			this.scr = scr;
			this.time = time;
		}
	}
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<Tesk> stk = new Stack<>();
		n = Integer.parseInt(br.readLine());
		
		res = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("1")) {
				int scr = Integer.parseInt(st.nextToken());
				int time = Integer.parseInt(st.nextToken());
				
				if(time == 1) {
					res += scr;
				}else {
					stk.add(new Tesk(scr,time-1));
				}
				
			}else if(!stk.isEmpty()) {
				Tesk cur = stk.pop();
				
				cur.time--;
				
				if(cur.time == 0) {
					res += cur.scr;
				}else {
					stk.add(cur);
				}
			}
			
			
		}
		
		System.out.println(res);
	}
}
