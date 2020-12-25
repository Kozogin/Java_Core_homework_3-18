package ua.lviv.lgs.enumeration;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class ApplStreamBP {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer [] {2, 56, 26, 84, 76, 8, 0, 13}));
		System.out.println(list);
		list = list.stream().sorted().collect(toList());
		System.out.println(list);
		
		list = list.stream().sorted(reverseOrder()).collect(toList());
		System.out.println(list);

	}

}
