package com.practice;

import java.util.Arrays;

public class CommonChild_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("MaxCnt :: "+new CommonChild().maxCommonChildCnt("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));
		System.out.println(commonChild("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", "FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));

	}

	public static int commonChild(String s1, String s2) {
		// Write your code here
		int[] current = new int[s1.length()];
		int[] previous = new int[s1.length()];

		for(int i = 0; i < s1.length() ; i++) {
			for(int j = 0; j < s1.length(); j++) {
				final int i1 = (j == 0) ? j : j - 1;
				if(s1.charAt(i) == s2.charAt(j)) {
					current[j] =  1 + previous[i1];
				} else {
					current[j] = Math.max(current[i1], previous[j]);
				}
			}

//			Arrays.stream(current).forEach(value -> System.out.print(value+" "));
			System.out.println();

			previous = Arrays.copyOf(current, current.length);
			Arrays.fill(current, 0);
		}

//		Arrays.stream(previous).forEach(i -> System.out.print(i+" "));
		return previous[s1.length() - 1];
	}


}
