package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17419 {
	
	public static void main(String[] args) throws IOException{
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String k = br.readLine();
		
		
		int cnt = 0;
		for (int i = 0; i < k.length(); i++) {
			if(k.charAt(i) == '1') {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
	}
}
