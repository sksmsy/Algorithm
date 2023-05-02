package mst;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 18111 마인크래프트 
 * 구현 
 * 
 * 
 *  n ,m 터 구함 
 * 1 .i,j 블록제거 인벤토리 ->2초 
 * 2. 꺼내서  i,j 에 쌓기 -> 1초 
 *  땅고르는데 최소시간, 땅 높이  구하기 
 *   
 */
public class BOJ18111 {

	
		
		/*
		 *입력받음  n, m , B  (n * m , 인벤블록  B)
		 */
		
		//배열에 그리기 높이로 
		
		
		//조건 분기 
		// 높이가 다른곳 찾기 ->  높이편차가 다 다를수있음 
		// 필요한 블록 개수 찾기
		
		//1. 만약 제거해야 한다면 제거소요시간 구하기 
		
		//2. 채워야한다면 필요 갯수 구하기 
		//		->2-1 보유량으로 해결 가능하다 -> 끝
		//		->2-2 보유량으로 해결 불가능 -> 2-2-1 최소높이를 구해서채워야함 
		//							-> 2-2-2 채워야하는 양 ,파내야 하는 양 비교해서 조건 수립 
		//								2-2-2-1 채워야함 > 파내야함 
		//								생각해보니 2-2-2-1 과정을 제일 먼저 해야할지도 
		
		static int arr[][];
		static int result[] = new int[2];
		
		static int time = Integer.MAX_VALUE;
		static int height;
		static int block;
		static int N, M, B;
		
		
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st;
		
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 세로
			M = Integer.parseInt(st.nextToken()); // 가로
			B = Integer.parseInt(st.nextToken()); // 가지고있는 블록의 갯수
		
			arr = new int [N][M];		
			int max = 0;
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<M; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
		
					max = Math.max(max, arr[i][j]);
				}
			}
		
			brute_force(max);
		
			System.out.println(time + " " + height);
		} // End of main
		
		static void brute_force(int max) {
		
			// arr전체를 탐색해서 각 블럭의 갯수를 맞춰보며, 시간을 계산
			// 각 시간의 최소값으로 갱신.
			for(int i=0; i<=max; i++) {
				result = excavation(i); 
		
				if(time > result[0]) {
					time = result[0];
					height = result[1];
				}
	            // 시간이 같을 경우, 높이가 더 높은것을 채택한다.
				else if(time == result[0] && height < result[1]) {
					time = result[0];
					height = result[1];
				}
		
			}
		} 
		// 시간, 높이 반환 
		static int[] excavation(int height) {
			int block = B;
			int time = 0;
		
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					int value = arr[i][j];
		
					// value기준으로 맞추려고 하는 높이(height)가 더 낮은 경우
					// 즉, 블럭을 깎아야 하는 경우
					if(value == height) {
						continue;
					}
					
					if(value > height) {
						time += (value - height)*2;
						block += (value - height);
					}
	                // value기준으로 맞추려고 하는 높이(height)가 더 높은 경우
					// 즉, 블럭을 쌓아야하는 경우
					else {
						time += height - value;
						block -= (height - value);
					}
				}
			}
			
			// 남은 블럭의 갯수가 0 미만이면 불가능으로 판단. 최고치를 반환.
			if(block < 0) {
				result[0] = 999999999;
				return result;
			}
			
			result[0] = time;
			result[1] = height;
			
			return result;
		} 
	} 
	

