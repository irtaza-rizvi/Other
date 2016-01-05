import java.util.*;

public class HashTable {
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}

		return result;
	}

	public static int[] twoSum2(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			Integer index1 = map.get(target - numbers[i]);
			if (index1 != null) {
				return new int[] { index1, i + 1 };
			}
			map.put(numbers[i], i + 1);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 7, 11, 15 };
		a1 = twoSum(a1, 10);
		int[] a2 = { 3, 7, 11, 15 };
		a2 = twoSum2(a2, 10);
		System.out.println("a1: (" + a1[0] + ", " + a1[1] + ")");
		System.out.println("a2: (" + a2[0] + ", " + a2[1] + ")");
	}
}
