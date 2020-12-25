package ua.lviv.lgs.t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args) {
		
		Set<Star> setStar = new HashSet<>();
		
		setStar.add(new Star("�������", 0.38, 11.4));
		setStar.add(new Star("�����������", 0.5, 530));
		setStar.add(new Star("�������", -0.72, 310));
		setStar.add(new Star("�������", -0.27, 4.3));
		setStar.add(new Star("�������", 0.03, 42.2));
		setStar.add(new Star("г����", 0.12, 530));
		setStar.add(new Star("������", -0.05, 37.6));
		setStar.add(new Star("����", 0.03, 25));
		setStar.add(new Star("�����", -26.72, 0.0000158));
		setStar.add(new Star("ѳ���", -1.46, 8.6));		
		setStar.add(new Star("ѳ���", 1.46, 18.6));
		
		for (Star star : setStar) {
			System.out.println(star);
		}
		System.out.println();
		
		List<Star> listStarSort = new ArrayList<>(setStar);
		
		Collections.sort(listStarSort, new StarNameComparator());		
		for (Star star : listStarSort) {
			System.out.println(star);
		}
		System.out.println();
		
		Collections.sort(listStarSort, new StarBrightnessComparator());		
		for (Star star : listStarSort) {
			System.out.println(star);
		}
		System.out.println();
		
		Collections.sort(listStarSort, new StarDistanceComparator());		
		for (Star star : listStarSort) {
			System.out.println(star);
		}
		System.out.println();
		
		Collections.sort(listStarSort);
		for (Star star : listStarSort) {
			System.out.println(star);
		}
		System.out.println();
	}
}
	
