package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4848 {

	
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String arr[] = new String[16];
		
		arr[0] = "{}";
		arr[1] = "{{}}";
		
		for (int i = 2; i < 16; i++) {
			arr[i] = "{";
			
			for(int j = 0; j < i; j++) {
				arr[i] += arr[j];
				
				if(i-1 != j) {
					arr[i] += ",";
				}
			}
			arr[i] += "}";
		}
		
		
		int t = Integer.parseInt(br.readLine());
		while(t-- >0) {

			String a = br.readLine();
			String b = br.readLine();
			
			int ab =0;
			for (int i = 0; i < 16; i++) {
				if(a.equals(arr[i])) {
					ab+=i;
				}
				if(b.equals(arr[i])) {
					ab+=i;
				}
			}
			
			sb.append(arr[ab]).append("\n");
			
		}
		System.out.println(sb);
	}
}
