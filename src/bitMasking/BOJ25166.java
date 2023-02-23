package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25166 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(s < 1024) {
			System.out.println("No thanks");
		}else {
			int need = s - 1023;
			if((need&m) == need) {
				System.out.println("Thanks");
			}else {
				System.out.println("Impossible");
			}
		}
	}
}
