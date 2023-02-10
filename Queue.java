import java.util.Scanner;

public class Queue {
    private static int[] Queue;
    int rear ;
    int front ;
    private Scanner  scanner = new Scanner(System.in) ;

    


    public Queue(int size )  {
        Queue = new int[size] ;
        front = -1 ;
        rear  = -1 ;

    }

    public void Enqueue() {
          if( rear == Queue.length -1 ) {
              System.out.println("Queue is overflow.");
          } else {
              if( front == -1 ){
                  front = 0 ;
              }

              System.out.println("Enter the element for insertion  :");
              rear++  ;
              Queue[rear]=scanner.nextInt() ;
              System.out.println("Item inserted successfuly.");
              System.out.println(rear);
              System.out.println();
          }
    }

    public void DeQueue() {
        if(front == -1 && rear == -1 ) {
            System.out.println("Queue is underflow error.");
        } else {
              System.out.println("The deleted element from the queue  :"
                        +Queue[front]);

                front ++ ;

                System.out.println("Element deleted successfully.");


        }
    }
    public  void print() {
        if ( rear<front ){
            System.out.println("Queue is empty.");
            return;
        }
        for(int i = front; i<= rear ; i++){
            System.out.printf("%d " ,Queue[i]);
        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.Enqueue();
        queue.Enqueue();
        queue.print();

        System.out.println();
        System.out.println();

        queue.DeQueue();
        queue.print();

        queue.DeQueue();
        queue.print();


    }
}
