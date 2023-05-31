package pr;

import java.util.*;

public class 캐시 {
	public static void main(String[] args) {
		
		String[] arr = {"Jeju", "Pangyo", "NewYork", "newyork"};
		System.out.println(solution(3, arr));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> q = new LinkedList<>();

		if (cacheSize == 0) {
			return cities.length * 5;
		}

		for (int i = 0; i < cities.length; i++) {
			String tmp = cities[i].toUpperCase();

			if (q.contains(tmp)) {
				q.remove(tmp);
				q.add(tmp);
				answer++;
			} else {
				if (q.size() < cacheSize) {
					q.add(tmp);
				} else {
					q.poll();
					q.add(tmp);
				}

				answer += 5;
			}

		}

		return answer;

	}

}
