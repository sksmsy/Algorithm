package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17202 {
	
	static char result[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		char arr[] = new char[a.length()+b.length()];
		
		int j = 0;
		for (int i = 0; i < arr.length; i+=2) {
			arr[i] = a.charAt(j);
			arr[i+1] = b.charAt(j);
			j++;
		}

		
		fn(arr);
		System.out.println(result[0]+result[1]);
		
	}
	
	public static void fn(char arr[]) {
		if(arr.length == 2) {
			result = arr;
			return;
		}
		
		char temp[] = new char[arr.length-1];
		
		for (int i = 0; i < temp.length; i++) {
			int s = (int)(arr[i]+arr[i+1]);
			temp[i] = (char) (s % 10);
		}
		
		fn(temp);
	}
}
