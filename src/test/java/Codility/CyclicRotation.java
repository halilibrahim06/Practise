package Codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        
        int[]	A = {-3, 8, 9, -7, 6} ;
        int K = 3;

        int[] sol4 = solution(A,K);
        System.out.println("sol4-->" + Arrays.toString(sol4));
    }


    public static int[] solution (int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < result.length; i++) {
            int newPosition = (i + K) % result.length;
            result[newPosition] = A[i];
        }

        return result;
    }
}
