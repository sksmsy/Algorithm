package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 
 * n : 상자의 개수
 * l : 상자의 사이즈 ()
 * 
 * 두번째 줄부터 상자의 각각 x좌표
 * 1번, 2번, ..., n번 상자라고 보았을 때 i번 상자의 중심은 (xi, 2L×i - L) 이 되고
 * 이는 i번 상자 1개의 무게 중심과 같다.
 * 
 * 
 */

public class BOJ20116 {

	public static void main(String[] args) throws IOException{
		
		int n,l,arr[];
		double sum[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		sum = new double[n+1];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i-1] + arr[i];
		}
		
		int cen = arr[1];
		double res=0;
		double add = sum[n]-sum[2];
		res = add/(n-1);
		
		if(res <= l+cen && (l-cen) <= res) {
			System.out.println("stable");
		}else {
			System.out.println("unstable");
		}
	}
}
