package com.practice;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MaximumPalindromes {

	private static final int M = 1000000007;
	public static void main(String[] args) {
//		System.out.println("MaximumPalindromes.");
//		System.out.println("Result Map :: "+ new MaximumPalindromes().getCharCount("aaaaa"));
		System.out.println("Result Map :: "+ new MaximumPalindromes().getCharCount("wldsfubcsxrryqpqyqqxrlffumtuwymbybnpemdiwyqz".substring(21, 35)));
//		System.out.println("Result Map :: "+ new MaximumPalindromes().getCharCount("ymbybnpem"));
//		System.out.println("Result Map :: "+ new MaximumPalindromes().getCharCount("yqpqyqqxrlffumtuwymby"));
//		System.out.println("Result Map :: "+ new MaximumPalindromes().getCharCount("amim"));
	}

	public int getCharCount(String str) {				
		//Method 1
		/*HashMap<String, Integer> resultMap = new HashMap();		
		IntConsumer consumer = i -> {
			if(resultMap.containsKey(""+i)) {
				resultMap.put(""+i, (Integer.parseInt(resultMap.get(""+i).toString())+1));
			} else {
				resultMap.put(""+i, 1);
			}
		};
		
		str.chars().forEachOrdered(consumer);
		
		Scanner scanner = new Scanner(System. in);
        String inputString = scanner. nextLine();
		str = inputString;*/
        
		System.out.println("String :: "+str);
		
		//Method2
		/*Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("MyMap :: "+map);
		if(map.size() == 1)
			return 1;

		int count[] = new int[2];
		map.forEach((k ,v)->{
			if(v%2 == 0) {
				count[0] += v/2;	
			} else {
				count[0] += v/2;
				count[1]++;	
			} 
		});
		
		System.out.println("Even :: "+count[0]+" - Odd :: "+count[1]);		
		int maxPalindromes = 0;
		if(count[1] != 0) {
			maxPalindromes += count[1];
		} else {
			return count[0];
		}
		
		return maxPalindromes;*/

		//Method3
		//Grouping based on letter.
		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();

		//Separate even and odd count letters.
		map.keySet().stream().forEach(key -> {
			if(map.get(key) % 2 == 0) {
				evenList.add(new Integer(map.get(key).toString()));
			} else {
//				if(map.get(key) > 2) {
//					evenList.add((int) (map.get(key) / 2));
//				}
//				oddList.add((int) (map.get(key) % 2));
				oddList.add( new Integer(map.get(key).toString()));
			}
		});

		if(evenList.size() == 0)
			return 0;

		//Count of pair letters.
		int evenListSum = (evenList.stream().reduce(0, Integer::sum)) / 2;
		int oddListSum = oddList.stream().reduce(0, Integer::sum);

		//Product of factorials of each letter pair count.
		Integer evenListFactProduct = evenList.stream().reduce(1, (i, j) -> i * factorial(j/2));

		int result = ((factorial(evenListSum)/evenListFactProduct) * (oddListSum==0 ? 1: oddListSum)) % M;
		System.out.println("Result :: "+result);

		return result;
	}

	private static Integer factorial(int i) {
		if(i == 0)
			return 1;
		return i * factorial(i-1);
	}
}
