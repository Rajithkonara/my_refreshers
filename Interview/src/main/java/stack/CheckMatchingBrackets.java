package stack;

public class CheckMatchingBrackets {

    private String[] arr;
    private int top;

    private CheckMatchingBrackets(int n) {
        arr = new String[n];
        top = -1;
    }

    private void push(String x) {
        arr[++top] = x;
    }

    private String pop() {
        return arr[top--];
    }

    private String peek() {
        return arr[top];
    }

    private boolean isEmpty() {
        return (top == -1);
    }

    static boolean isMatchingPair(String character1, String character2) {
        if (character1 == "(" && character2 == ")")
            return true;
        else if (character1 == "{" && character2 == "}")
            return true;
        else if (character1 == "[" && character2 == "]")
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        CheckMatchingBrackets stack = new CheckMatchingBrackets(6);

        String[] brackets = {"[", "{", "}", ")", "[", "]"};
//        stack.push("[");
//        stack.push("{");
//        stack.push("}");
//        stack.push(")");
//        stack.push("[");
//        stack.push("]");


        int count = 0;

        for (int i = 0; i < brackets.length - 1; i++) {


          /*If the exp[i] is a starting
            parenthesis then push it*/
            if (brackets[i] == "{" || brackets[i] == "(" || brackets[i] == "[")
                stack.push(brackets[i]);

            if (brackets[i] == "}" || brackets[i] == ")" || brackets[i] == "]") {

                if (stack.isEmpty()) {
                    return;

                } else if (!isMatchingPair(stack.pop(), brackets[i])) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
