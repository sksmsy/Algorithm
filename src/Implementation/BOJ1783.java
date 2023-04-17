package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1783 {
	static int n,m;
	public static void main(String[] args) throws IOException{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		System.out.println(fn()); 
		
	
	}
	
	
	public static int fn() {
		if(n == 1) 
			return 1;
		if(n == 2) 
			return Math.min(4, (m+1)/2);
		if(m < 7)
			return Math.min(4, m);
		return m-2;
	}
}
