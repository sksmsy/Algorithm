package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1940 {

	static int n,m,res;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<Integer> set = new HashSet<Integer>();
		
//		for (int i = 0; i < n; i++) {
//			int x = Integer.parseInt(st.nextToken());
//			if(set.contains(m - x)) res++;
//			set.add(x);
//		}
//		
//        for(int start=0; start<n; start++)  {
//            int sum = 0;
//            int end = start+1;
//
//            while (end<n) {
//                sum = material[start];
//                sum += material[end++];
//                if (sum == m) {
//                    cnt++;
//                    break;
//                }
//            }
//
//        }
			
		System.out.println(res);
	}
}
