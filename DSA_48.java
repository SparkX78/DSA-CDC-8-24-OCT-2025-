import java.util.*;
public class DSA_48 {
    public static int[] asteroids(int[] nums){
        Stack<Integer> stack = new Stack<>();
        for(int a: nums){
            boolean alive = true;
            while(alive && a < 0 && !stack.isEmpty() && stack.peek() > 0){
                if(stack.peek() < -a){
                    stack.pop();
                }
                else if(stack.peek() == -a){
                    stack.pop();
                    alive = false;
                }
                else{
                    alive = false;
                }

            }
            if(alive == true){
                stack.push(a);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = result.length-1; i >= 0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {2,5,-6, 10, -3, -4};
        int[] result = asteroids(nums);
        System.out.println(Arrays.toString(result));
    }
}
