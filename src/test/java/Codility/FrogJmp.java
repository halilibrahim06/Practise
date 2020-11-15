package Codility;

public class FrogJmp {


        public int solution(int X, int Y, int D) {

            int initialJumpCount = (Y-X) / D;

            int remainingJumpCount = (Y-X) % D;

            return
                    (remainingJumpCount > 0 ? initialJumpCount + 1: initialJumpCount);

        }


    public static void main(String[] args) {

    }
}
