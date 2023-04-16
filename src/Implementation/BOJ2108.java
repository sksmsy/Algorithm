package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ2108 {

	
	static int n,arr[],avg,mid,cnt,rng;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg+= arr[i];
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		Arrays.sort(arr);

		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			int cnt = map.get(arr[i]);
			a = Math.max(a, cnt);
			
			
		}
		
		sb.append(avg/n).append("\n");
		sb.append(arr[n/2]).append("\n");
		sb.append(false).append("\n");
		sb.append(arr[n-1] - arr[0]).append("\n");
	}
}
