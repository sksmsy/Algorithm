package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ1337 {
	
	static int n,arr[],L,R,res;
	static List<Integer> list;
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Integer>();
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < 5; j++) {
				if(!list.contains(list.get(i)+j)) {
					arr[i]++;
				}
			}
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
	}
}
