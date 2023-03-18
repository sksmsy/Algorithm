package Implementation;

public class BOJ4673 {

	static boolean arr[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {

		arr = new boolean[10001];
		for (int i = 1; i <= 10001; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
				fn(i);
			}
		}
		System.out.println(sb);
	}
	
	public static void fn(int a) {
		int sum = a;
		
		while(sum<=10000) {
			arr[sum] = true;
			while(a > 0) {
				int k = a % 10;
				sum +=k;
				a /= 10;
			}
			a = sum;
		}
		
	}
}
