package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ2621 {

	public static class Card{
		String color;
		int num;
		
		public Card(String color, int num) {
			this.color = color;
			this.num = num;
		}
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		List<Card> list = new ArrayList<>();
		int max =0;
		for (int i = 0; i < 5; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			String color = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			list.add(new Card(color,num));
			
			max = Math.max(max,num);
			
		}
		
		System.out.println(fn(list,max));
	}
	
	public static int fn(List<Card> list,int max) {
		
		boolean flu = false;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(0).color.equals(list.get(i).color)){
				flu = true;
			}else {
				flu = false;
			}
		}
		
		if(flu) {
			
			int arr[] = new int[5];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = list.get(i).num;
			}
			
			if(st(arr)) {
				return 800+max;
			}
			return 600+max;
			
			
			
		}else {
			int maxCnt = 0;
			int maxCntNum = 0;
			for (int j = 0; j < list.size(); j++) {
				int cnt = 0;
				int n = list.get(j).num;
				
				for (int i = 0; i < list.size(); i++) {
					if(n == list.get(i).num) {
						cnt++;
					}
				}
				if(cnt > maxCnt) {
					maxCnt = cnt;
					maxCntNum = n;
				}
			}
			//maxCnt -= 1;
			if(maxCnt == 4) {
				return 800+max;
			}
			else if(maxCnt == 3) {
				
				for (int i = 0; i < list.size(); i++) {
					int cnt = 0;
					int n = list.get(i).num;
					
					for (int j = 0; j < list.size(); j++) {
						if(n != maxCntNum && n == list.get(j).num) {
							cnt++;
						}
					}
					if(cnt == 2) {
						
						return 700+max;
					}
				}
				
			}else if(maxCnt == 2) {
				for (int i = 0; i < list.size(); i++) {
					int cnt = 0;
					int n = list.get(i).num;
					
					for (int j = 0; j < list.size(); j++) {
						if(n != maxCntNum && n == list.get(j).num) {
							cnt++;
						}
					}
					if(cnt == 2) {
						return 300+max;
					}
				}
				return 200+max;
			}else if(maxCnt == 1) {
				int arr[] = new int[5];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = list.get(i).num;
				}
				
				if(st(arr)) {
					return 500+max;
				}
			}
		}
		return 100+max;
	}
	
	public static boolean st(int arr[]) {
		Arrays.sort(arr);
		int num =arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			if(!(++num == arr[i])) {
				return false;
			}
		}
		return true;
	}
	
}
