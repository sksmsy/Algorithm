package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ24389 {
	static int n;
	public static void main(String[] args)  throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		int n2 = ~n + 1;
		
		int comp = n ^ n2;
		
		//System.out.println(Integer.bitCount(comp));

		int cnt = 0;
		for (char ch : Integer.toBinaryString(comp).toCharArray()) {
			if( ch == '1') cnt ++;
		}
		
		System.out.println(cnt);
	}
	
}
