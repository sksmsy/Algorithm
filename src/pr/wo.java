package pr;

public class wo {

	
	public static void main(String[] args) {
		
		
		String board[] = {"EEEEE","EEMEE","EEEEE"};
		
		char[][] tmp = new char[board.length][board[0].length()];
		
		for (int i = 0; i < tmp.length; i++) {
			char str[] = board[i].toCharArray();
			tmp[i] = str;
		}
		
		
		
		String[] reMap = new String[board.length];
		for (int i = 0; i < reMap.length; i++) {
			reMap[i] = tmp[i].toString();
		}
		System.out.println(reMap);
		
	}
}
