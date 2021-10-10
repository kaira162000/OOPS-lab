import java.util.*;
import java.lang.*;

//TODO
//can we print "EmptyQueue" itself without the whole message
public class Q6 {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        Queue queue = new Queue();
        while(true) {
            switch(scan.next().toUpperCase().charAt(0)) {
                case 'E': queue.enqueue(scan.nextInt()); scan.nextLine(); break;
                case 'D': queue.dequeue(); break;
                default: throw new Exception("Invalid input");
            }
        }
    }
}

class Queue{
    int size;
    Node start, end;
    private class Node {
        int data;
        Node next;
        Node(int d, Node n) {
            this.data = d;
            this.next = n;
        }
    }
    
    Queue() {
        this.size = 0;  
        this.start = null;
        this.end = null;
    }
    
    public void enqueue(int item) {
        ++size;
        Node n = new Node(item, null);
        if(start == null)
            start = n;
        else{
            Node temp = start;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        System.out.println("Success");
    }
    
    public void dequeue() throws Exception{
        if(isEmpty()) {
            throw new Exception("EmptyQueue");
        }
        int d = start.data;
        Node n = start;
        Node temp = start;
        while(n.next != null ) {
            temp = n;
            n.data = n.next.data;
            n = n.next;
        }
        temp.next = null;
        --size;
        System.out.println(d);
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public boolean isFull() {
        return false;
    }
    public int size() {
        return size;
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("EmptyQueue");
            return ;
        }
        Node temp = start;
        while(temp.next!=null) {
            System.out.print(temp.data + " ");
        }
        System.out.println(temp.next.data);
    }
}
