package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.binarySearch;

public class ClimbingLeaderboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10,20};
		int[] alice = {11,12};
		
		/*
		Integer result[] = new ClimbingLeaderboard().printRank(scores, alice);
		String strArr[] = str.split(" ");
		int[] intArray = new int[strArr.length-1];
		
		for(int i=strArr.length-1, j=0; i>=0; i--) {
			if(!strArr[i].isEmpty()) {
				intArray[j] = Integer.parseInt(""+strArr[i]);
				j++;
			}
			
		}*/

		/*int[] array = IntStream.range(0,scores.length).map(i->scores[scores.length-i-1]).distinct().toArray();
		int index = 0;
		for(int score: alice) {
			index = binarySearch(array, index < 0 ? 0 : index, array.length, score);
			if (index < 0) index = -index - 2;
			System.out.println(array.length - index);
		}*/
		System.out.println(new ClimbingLeaderboard().printRank(scores, alice).toString());
	}
	
	private int[] printRank(int[] scores, int[] alice) {
		List<Integer> resultList = new ArrayList<>();
		int scoresCnt = 0,  aliceCnt = 1, rankCnt = 1;
		boolean temp = false;
		
		while(aliceCnt <= alice.length) {			
			
			if( (scoresCnt >= scores.length) || (scoresCnt != 0 && scores[scoresCnt-1] != scores[scoresCnt] && !temp)) {
				rankCnt++;
			}
			
			if(scoresCnt >= scores.length || alice[alice.length - aliceCnt] >= scores[scoresCnt]) {
				resultList.add(rankCnt);
				aliceCnt++;
				temp = true;
				continue;
			}					
			
			temp = false;
			scoresCnt++;
		}

		Collections.reverse(resultList);

		return resultList.stream().mapToInt(Integer::intValue).toArray();
	}
}
