import java.util.Scanner;

public class Stack {
    private int top;
    private static int[] stack;
    private static Scanner scanner = new Scanner(System.in) ;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = item;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int item = stack[top];
            top--;
            return item;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        System.out.println("Please enter size of stack  :");
        int size = scanner.nextInt();
        Stack s = new Stack(size);
        s.push(10);
        s.push(20);
        s.push(40);
        System.out.println("Total element in stack :");
        for(int i = 0 ; i<= s.top ; i++){
            System.out.printf("%d " , stack[i]);
        }

        s.push(77);
        for(int i = 0 ; i<= s.top ; i++){
            System.out.printf("%d " , stack[i]);
        }


    }
}
