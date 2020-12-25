package ua.lviv.lgs.t1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayInt {
	
	public static void main(String[] args) {
		
		Integer [] arrayInt = new Integer [16];
		
		for(int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = new  Random().nextInt(1000);
		}
		
		System.out.println(Arrays.toString(arrayInt));
		Arrays.sort(arrayInt);
		System.out.println(Arrays.toString(arrayInt));
		
		Arrays.sort(arrayInt, Collections.reverseOrder());
		System.out.println(Arrays.toString(arrayInt));	
	}

}
