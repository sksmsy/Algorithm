package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ1780 {

	static int m,z,p = 0;
	static int arr[][];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		divideFn(0, 0, n);
		
		System.out.println(m);
		System.out.println(z);
		System.out.println(p);
		
	}
	
	public static void divideFn(int x, int y, int size) {
		
		if(chkFn(x,y,size)) {
			if(arr[x][y] == -1) {
				m++;
			}else if(arr[x][y] == 0) {
				z++;
			}else {
				p++;
			}
			return;
		}
		
		
		int newSize = size/3;
		
		divideFn(x, y, newSize);								//왼쪽 위
		divideFn(x, y+newSize, newSize);						//중앙 위
		divideFn(x, y + 2 * newSize, newSize);					//오른쪽 위
			
		divideFn(x + newSize, y, newSize);						//왼쪽 중
		divideFn(x + newSize, y + newSize, newSize);			//중앙 중
		divideFn(x + newSize, y + 2 * newSize, newSize);		//오른쪽 중

		divideFn(x + 2 * newSize, y, newSize);					//왼쪽 하
		divideFn(x + 2 * newSize, y + newSize, newSize);		//중앙 하
		divideFn(x + 2 * newSize, y + 2 * newSize, newSize);	//오른쪽 하
		
	}
	
	
	public static boolean chkFn(int x, int y, int size) {
		int num = arr[x][y];
		
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if(num != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
