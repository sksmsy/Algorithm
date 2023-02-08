package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ6603 {

	static int k,arr[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			k = Integer.parseInt(st.nextToken());
			
			if(k == 0) break;
			
			arr = new int[k];
			for (int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			fn(0,0,"");
			System.out.println();
		}
		
	}
	
	
	public static void fn(int j, int cnt ,String str) {
		if(cnt == 6){
			System.out.println(str);
			return;
		}
		
		for (int i = j; i < k; i++) {
			fn(i+1,cnt+1,str+arr[i]+" ");
		}
	}
}
