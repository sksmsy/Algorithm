package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ2002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Integer> map = new HashMap<String, Integer>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			map.put(br.readLine(), i);
		}
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			arr[i] = map.get(tmp);
		}
		
		int res=0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					res+=1;
					break;
				}
			}
		}
		
		System.out.println(res);
	}
}
