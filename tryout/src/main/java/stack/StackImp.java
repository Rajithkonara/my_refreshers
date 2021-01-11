package stack;

public class StackImp {

    private int[] stackArr;
    private int top;

    private StackImp(int n) {
        stackArr = new int[n];
        top = -1;
    }

    private void push(int x) {
        stackArr[++top] = x;
    }

    private int pop() {
        return stackArr[top--];
    }

    private int peek() {
        return stackArr[top];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackImp stackImp = new StackImp(5);
        stackImp.push(1);
        stackImp.push(2);
        stackImp.push(3);
        stackImp.push(4);
        stackImp.push(5);

        System.out.println(stackImp.peek());

        while (!stackImp.isEmpty()) {
            long value = stackImp.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
