package pr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
//		Map<String, Integer>map = new HashMap<String, Integer>();
//		
//		map.getOrDefault(map, null)
//		
//		double a = ((1*100)/8);
//		Map<String, Double> map;
//		
//		System.out.println(sol("1S2D*3T*"));
		//1S*2D*3T*
		
	}
	public static int sol(String dartResult) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		dartResult = dartResult.replace("10", "k");
		String score="0123456789k";
		String bonus = "SDT";
		String option ="*#";
		String arr[] = dartResult.split("");
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			if(score.contains(s)) {
				int num = (s.equals("k")? 10:Integer.parseInt(s));
				stack.add(num);
			}
			
			if(bonus.contains(s)) {
				int num = stack.pop();
				if(s.equals("D")) {
					num = (int) Math.pow(num, 2);
				}
				if(s.equals("T")) {
					num = (int) Math.pow(num, 3);
				}
				stack.add(num);
			}
			
			if(option.contains(s)) {
				if(s.equals("*")) {
					if(stack.size() == 1) {
						int num = stack.pop()*2;
						stack.add(num);
					}else {
						int num = stack.pop()*2;
						int num2 = stack.pop()*2;
						stack.add(num2);
						stack.add(num);
					}
				}
				if(s.equals("#")) {
					int num = stack.pop()*-1;
					stack.add(num);
				}
			}
		}
		while(!stack.isEmpty()) {
			answer+=stack.pop();
		}
		return answer;
	}
}
