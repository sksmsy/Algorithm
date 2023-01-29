package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BackJ1068 {
	
	static ArrayList<Integer>[] al;
	static int n;
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int root= 0;
		al = new ArrayList[n];
		visit = new boolean[n];
		for (int i = 0; i < n; i++) {
			al[i] = new ArrayList<Integer>();
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < n; i++) {
			int node = Integer.parseInt(st.nextToken());
			
			if(node == -1) {
				root = i;
				continue;
			}
			
			al[node].add(i);
		}
		
		int d = Integer.parseInt(br.readLine());
		if(d == root) {
			System.out.println(0);
		}else {
			delete(d);
			
			int result = findLeaf(root);
			System.out.println(result);
		}
		
		
		
		
	}
	public static void delete(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(start);
		visit[start] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			
			for (Integer i : al[temp]) {
				visit[i] = true;
				q.add(i);
			}
		}
	}
	
	public static int findLeaf(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		int leafCnt = 0;
		
		visit[n] = true;
		
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			int childCnt = 0;
			
			for (Integer i : al[temp]) {
				if(visit[i]) {
					continue;
				}
				visit[i] = true;
				q.add(i);
				childCnt++;
				
				
			}
			if(childCnt == 0) {
				leafCnt++;
			}
		}
		return leafCnt;
	}
}



//package baekjoon;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class B1068 {
//   static List<Integer>[] lists;
//   static int N;
//   static boolean[] visit;
//   
//   public static void main(String[] args) throws IOException {
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringTokenizer st = new StringTokenizer(br.readLine());
//      int root = 0;
//      N = Integer.parseInt(st.nextToken());
//      lists = new ArrayList[N];
//      visit = new boolean[N];
//      
//      for(int i=0; i<N; i++) {
//         lists[i] = new ArrayList<>(); 
//      }
//      
//      
//      st = new StringTokenizer(br.readLine());
//      for(int i=0; i<N; i++) {
//         int p = Integer.parseInt(st.nextToken());
//         if(p == -1) {
//            root = i;
//            continue;
//         }
//         lists[p].add(i);
//         
//      }
//      
//      int start = Integer.parseInt(br.readLine());
//      if(start == root) {
//         System.out.println(0);
//      }else {
//         delete(start);
//         int result = find(root);
//         
//         System.out.println(result);
//         
//      }
//      
//      
//   }
//   
//   public static void delete(int start) {
//      Queue<Integer> q = new LinkedList<>();
//      q.add(start);
//      visit[start] = true;
//      
//      while(!q.isEmpty()) {
//         int cur = q.poll();
//         
//         for(int child : lists[cur]) {
//            visit[child] = true;
//            q.add(child);
//         }
//      }
//   }
//   
//   public static int find(int root) {
//      
//      Queue<Integer> q = new LinkedList<>();
//      int reafCnt =0;
//      q.add(root);
//      visit[root] = true;
//      
//      while(!q.isEmpty()) {
//         int cur = q.poll();
//         int childCnt =0;
//         
//         for(int child : lists[cur]) {
//            if(visit[child]) {
//               continue;
//            }
//            visit[child] = true;
//            q.add(child);
//            childCnt++;
//         }
//         
//         if(childCnt==0) {
//            reafCnt++;
//         }
//      }
//      
//      return reafCnt;
//      
//   }
//   
//   
//   
//}
