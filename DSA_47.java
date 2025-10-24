import java.util.*;
public class DSA_47 {
    static class MinStack{
        private Stack<Integer> stack;
        private Stack<Integer> minStack;
    
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }
        public void push(int val){
            stack.push(val);
            if(minStack.isEmpty() || val <= minStack.peek()){
                minStack.push(val);
            }
        }
        public void pop(){
            if(stack.pop().equals(minStack.peek())){
                minStack.pop();
            }
        }
        public int peek(){
            return stack.peek();
        }
        public int getMin(){
            return minStack.peek();
        }
    }
    public static void main(String args[]){
        MinStack min = new MinStack();
        min.push(21);
        min.push(22);
        min.push(23);
        min.push(24);
        min.push(25);
        min.push(26);
        min.push(27);
        min.push(28);
        min.push(29);

        System.out.println(min.getMin());
        min.pop();
        System.out.println(min.peek());
        System.out.println(min.getMin());
    }
}
