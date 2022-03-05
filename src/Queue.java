import java.util.Collections;
import static java.util.Collections.list;

public class Queue<T> {
    private Object[] list;
    public int top;
    public int bottom;
    private int size;

    int[] iterare = new int[size];

    public Queue(int size){
        list = new Object[top, bottom];
        this.size = size;
    }


    public boolean plina(){
        if(top == 0 && bottom == size-1){
            System.out.println("Coada este plina!");
            return true;
        }
        else{
            return false;
        }
    }

    boolean goala(){
        if(top == -1){
            System.out.println("Coada este goala!");
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(T x) {
        if (plina()) {
            System.out.println("Coada este plina");
        }
        if(top == -1){
            top = 0;
            bottom++;
            list(top, bottom) = x;
            System.out.println("Element introdus " + x);
        }
    }



    int dequeue(){
        int element;
        if (goala()) {
            System.out.println("Coada este goala!");
            return -1;
        }
        else {
            element = iterare[top];
            if (top >= bottom){
                top = -1;
                bottom = -1; // Este un singur element in coada
            }
            else {
                top++;
                System.out.println("Sa sters un element " + element);
            }
        }
        return element;
    }

    public void afisare(){
       int i;
       if (goala()){
            System.out.println("Coada este goala");
        }
        else {
            System.out.println("Primul index " + top);
        }

        for (i=top; i<bottom; i++)
            System.out.println(i + " ");
    }

}


