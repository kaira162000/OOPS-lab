import java.util.*;

public class Q1 {

    static class Node {
    char data;
    Node next;
    }

    static class ReverseMain {
        static Node reverseList(Node head) {
            Node rhead = new Node();
            Node temp = head;
            Node temp2 = null;
            Node temp3 = new Node();
            while(temp != null) {
                temp3 = temp.next;
                temp.next = temp2;
                temp2 = temp;
                temp = temp3;
            }
            rhead = temp2;
            return rhead;
        }
    }

    public static void main(String args[]) {
        int N;
        Node head = new Node();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        N = scan.nextInt();
        scan.nextLine();
        // LinkedList<Node> nodes = new LinkedList<>(); //doubt 1
        Node temp = head;
        Node temp2 = temp;
        for(int i = 0; i < N; ++i) {
            System.out.print("Enter the data in Node" + i + ": ");
            temp.data = scan.next().charAt(0);
            temp.next = new Node();
            temp2 = temp;
            temp = temp.next;
        }
        temp2.next = null;   
        Node rhead = ReverseMain.reverseList(head);
        temp = rhead;
        while(temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}