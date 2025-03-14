package A_1_Practice;

public class A_2_linkedList {
    public static void display(Node head){
       Node temp = head;
       while(temp !=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
    } 
    public static class Node{
        int data;
        Node next;

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
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);

    }
}







// package A_24_LinkedList_part1;

// public class P_1_basic {
//     public static void display(Node head){
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
//     public static class Node{
//         int data;     //Value
//         Node next;   //address of next node

//         Node(int data){
//             this.data = data;
//         }
//     }
    
//     public static void main(String[] args) {
//         Node a = new Node(1);
//         Node b = new Node(2);
//         Node c = new Node(3);
//         Node d = new Node(4);
//         Node e = new Node(5);

       
//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
  
//         display(a);
        
       
//     }
    
// }

