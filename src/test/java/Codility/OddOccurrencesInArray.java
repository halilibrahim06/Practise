package Codility;

public class OddOccurrencesInArray {


    public static void main(String[] args) {

        int[] A = {9,3,9,3,9,7,9};

        int res = solution(A);
        System.out.println(" res===>"+res);
    }

    public static int solution(int[] A) {
        // sure there is at least one element
        int result = A[0];

        // bitwise xor wipes out double elements
        // only remains odd values
        // loop for remaining
        for(int i=1; i<A.length; i++) {
            result ^= A[i];
        }

        return result;
    }
}
