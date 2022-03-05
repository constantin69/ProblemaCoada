import java.util.ArrayList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        for (int i=1; i<3; i++) {
            System.out.println(q.enqueue);
        }

        q.afisare();

        q.dequeue();

        q.afisare();

    }
}
















    }
}
