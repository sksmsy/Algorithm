package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11723 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		
		
		StringTokenizer st;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			String pr = st.nextToken();
			if(pr.equals("add") || pr.equals("check") || pr.equals("toggle")) {
				
				int x = Integer.parseInt(st.nextToken());
				
				if(pr.equals("add")) {
					arr.add(x);
				}else if(pr.equals("check")) {
					if(arr.contains(x)) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
				}else if(pr.equals("remove")) {
					if(arr.contains(x)) {
						String tmp = ""+x;
						
						arr.remove(tmp);
					}
				}else if(pr.equals("toggle")) {
					if(arr.contains(x)) {
						String tmp = ""+x;
						arr.remove(tmp);
					}else {
						arr.add(x);
					}
				}
			}else if(pr.equals("all")){
				arr.clear();
				for (int j = 1; j <= 20; j++) {
					arr.add(j);
				}
			}else {
				arr.clear();
			}
			
			
			
			
		}
	}
}
