import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import  java.util.List;


public class Main {
    public static void main(String[] args) {


        Queue<Integer> queue = new Queue<>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);


        for (int i; i< 3; i++) {
            System.out.println(queue.dequeue());
        }


        System.out.println(queue.peek());

        System.out.print("Introduceti pozitia din lista :");
        int poz = new Scanner(System.in).nextInt();
        System.out.print("\n");

        System.out.println("Element de la pozitia " + poz + " este:  " + queue.indexOf(poz));

        System.out.println("Primul element servit: " + queue.dequeue());


    }
}
















    }
}
