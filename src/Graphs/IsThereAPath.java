package Graphs;

import java.util.*;

public class IsThereAPath {
	
	public static void main(String[] args) {
		int[][] board = {{0,3,1,0},
						{3,0,3,3},
						{2,3,0,3},{0,3,3,3}};
		int si = -1, sj = -1, ei = -1, ej = -1;
		for(int i = 0;i < board.length; i++) {
			for(int j = 0;j < board[0].length; j++) {
				if(board[i][j] == 1) {
					si = i;
					sj = j;
				}
				else if(board[i][j] == 2) {
					ei = i;
					ej = j;
				}
			}
		}
		System.out.println(isAPath(board,si,sj,ei,ej));
	}

	private static boolean isAPath(int[][] board, int si, int sj, int ei, int ej) {
		// TODO Auto-generated method stub
		 
		int[][] dirns = {{1,0},{0,1},{-1,0},{0,-1}};
		
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(si,sj));
		boolean[][] vis = new boolean[board.length][board[0].length];
		vis[si][sj] = true;
		
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			int x = p.x;
			int y = p.y;
			
			if(x == ei && y == ej) {
				return true;
			}
			
			
			for(int i = 0;i < dirns.length; i++) {
				int a = x + dirns[i][0];
				int b = y + dirns[i][1];
				
				if(a >= 0 && b >= 0 && a < board.length && b < board[0].length && !vis[a][b] && board[a][b] != 0) {
					queue.add(new Pair(a,b));
					vis[a][b] = true;
				}
			}
			
			
		}
		
		
		
		return false;
	}
	
	static class Pair{
		
		int x;
		int y;
		
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}

}
