package Codility;

import com.google.gson.internal.$Gson$Types;

import java.util.Stack;

public class AstroidCollusion {

    public static void main(String[] args) {

    }

    public int[] asteroidCollision(int[] A) {
        Stack<Integer> stack = new Stack<>();
        for (int comet : A) {
            if (comet < 0) {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(comet)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() > 0) {
                    if (stack.peek() == Math.abs(comet)) {
                        stack.pop();
                    }
                }
                else {
                    stack.push(comet);
                }
            }
            else {
                stack.push(comet);
            }
        }
        int[] state = new int[stack.size()];
        for (int i = state.length - 1; i >= 0; i--) {
            state[i] = stack.pop();
        }
        return state;
    }
}