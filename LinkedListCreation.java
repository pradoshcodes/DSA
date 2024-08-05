import java.util.Scanner;

public class LinkedListCreation {
    
    static class Node{
        int data;
        Node next;
      Node(int data){
        this.data=data;
        this.next=null;
      }
    }
    Node head=null;
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to add more elements? Press 1 for Yes or 0 for No: ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void Transverse(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
    }

    public static void main(String[] args) {
        LinkedListCreation ll=new LinkedListCreation();
        ll.creation();
        System.out.println("Linked List: ");
        ll.Transverse();
        
    }
}
