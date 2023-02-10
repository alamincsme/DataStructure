import java.util.Scanner;

public class Test {
    private int top ;
    private static int [] arr ;

    private static Scanner scanner = new Scanner(System.in) ;

    public Test( int size ) {
        arr  = new  int[size] ;
        top = -1 ;
    }

    public void push( int item ) {
        if( top == arr.length-1 ) {
            System.out.println("Stack is overflow.");
        } else {
            top++ ;
            arr[top] = item ;
        }
    }

    public  int pop() {
        if( top == -1 ){
            System.out.println("Stack is underflowr.");
            return  -1 ;
        } else {
            int item = arr[top] ;
            top-- ;
            return  item ;
        }
    }

    public  boolean isEmpty() {
         return  top == -1;
    }

    public void print() {
        for(int i = 0 ; i<= top ; i++ ){
            System.out.printf("%d ",arr[i] ) ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Please Enter Size of stack  :");
        Test test = new Test(scanner.nextInt());


        test.pop();
        test.push(10);
        test.push(20);
        test.print();

        System.out.println("pop operation.");
        test.pop();
        test.print();


        test.pop();
        test.pop();


    }
}