package finbarre.EnoughIsEnough;

import java.util.ArrayList;
import java.util.List;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		List<Integer> s = new ArrayList<Integer>();

		for (int element : elements) {
			if ((int) s.stream().filter(i -> i == element).count() < maxOccurrences) {
				s.add(element);
			}
		}
		return s.stream().mapToInt(i -> i).toArray();
	}
}