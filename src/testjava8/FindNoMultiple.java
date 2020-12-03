package testjava8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNoMultiple {

	public static int solution(int A, int B) {
		int count = 0;

		if (A >B) {
			return 0;
		} else {// 6,12,20 ans ->3 should be the count between 6 ->20

			List<Integer> numList = IntStream.rangeClosed(A, B).boxed().collect(Collectors.toList());
			// numList.stream().forEach(System.out::println);

			for (int i = 1; i <= B; i++) {
				int mul = i * (i + 1);
				if (numList.contains(mul) && mul <= B) {
					//System.out.println("For [" + i + "] and [ " + (i + 1) + " mutiple -->mul " + mul);
					count++;
					//System.out.println("<< mul present in the numList >>>" + count);

				}

			}
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.println(FindNoMultiple.solution(21,29));

	}

}
