package com.revature.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfIntegerStaringwith1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 22, 44, 15, 18, 100, 101, 111, 105));

		// list.stream().filter(y->y%2==0).forEach(x->System.out.println(x));

		
		/*
		 * for (Integer x : list) {
		 * 
		 * String s=String.valueOf(x);
		 * 
		 *  if(s.startsWith("1"))
		 * 
		 * System.out.print(x+" "); }
		 */

		for (int x : list) {

			String s = String.valueOf(x);
			if (s.charAt(0) == '1')
				System.out.print(x + " ");
		}
	}

}
