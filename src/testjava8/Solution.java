package testjava8;

import java.util.ArrayList;

public class Solution {
	
	
	
	public static String[] solution(int N, int K) {
        if (N == 0) {
            return new String[] {""};
        }
        ArrayList<String> result = new ArrayList<String>();
        
        
        for (String p : solution(N - 1, K - 1)) {
            for (char l : new char[] {'a', 'b', 'c'}) {
                int pLen = p.length();
                if (pLen == 0 || p.charAt(pLen - 1) != l) {
                    result.add(p + l);
                }
            }
        }
        int prefSize = Math.min(result.size(), K);
        return result.subList(0, prefSize).toArray(new String[prefSize]);
    }

	public static void main(String[] args) {
		System.out.println(new Boolean("").toString());
		
		/*
		 * String[] strArr = Solution.solution(2, 4);//Solution.solution(3,
		 * 20);//Solution.solution(2, 4);
		 * System.out.println("strArr length --> "+strArr.length); for (int i = 0; i <
		 * strArr.length; i++) { System.out.println(strArr[i]); }
		 */
		
	}

}
