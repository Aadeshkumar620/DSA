package A_24_LinkedList_part1;

public class P_1_basic {
    public static class Node{
        int data;     //Value
        Node next;   //address of next node

        Node(int data){
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

       
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.data);
        System.out.println(a.next.data);
    }
    
}
