package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14607 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(br.readLine());
        //1->0 2->1 3->3 4->6 5-> 10 6->15 7->21 8->28
        //찾아보니 이 수열은 삼각수라고함
		System.out.println((n*n-n)/2);
	}
}
