package com.practice.ds;

import java.util.HashSet;

class isValidSudoko {
	public boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < 9; i++) {
			HashSet<Character> set = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				char ele = board[i][j];
				if (ele != '.') {
					if (set.contains(ele))
						return false;
					else
						set.add(ele);
				}
			}
		}
		
	  for(int i = 0; i < 9; i++) {
			HashSet<Character> set = new HashSet<>();
			for (int j = 0; j < 9; j++) {
				char ele = board[j][i];
				if (ele != '.') {
					if (set.contains(ele))
						return false;
					else
						set.add(ele);
				}
			}
		}
	  
	  
	}
}