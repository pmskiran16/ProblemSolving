package com.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class StreamSample {

	public static void main(String args[]) {
		
		Integer arrInt[] = {1,2,3,4,5,6,7,8,9};
		List<Integer> list = Arrays.asList(arrInt);
		
//		list.stream().forEach(System.out::println);
//		list.stream().forEach(x -> System.out.print(x));
		
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","xyza");

		//get count of empty string
//		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
//		int count = (int) strings.stream().filter(String::isEmpty).count();
		String str = "";
//		str.length()
		
        Comparator <String> comparator = (p1, p2) -> Integer.compare(p1.length(), p2.length());
		
		String maxString = strings.stream()
								.filter(string -> ((string.length() % 2) == 0)?true:false)
//										.max(comparator)
								.max(new StringCompare())
										.orElseThrow(NoSuchElementException::new);
											
		System.out.println("MaxString :: "+maxString);
		
	}
	
}

class StringCompare implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		
		if(arg0.length() > arg1.length()) {
			return 1;
		} else if(arg0.length() < arg1.length()) {
			return -1;
		}
		
		return 0;
	}
	
	
}
