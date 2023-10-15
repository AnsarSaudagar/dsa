package LinkedList;

public class LinkedList{
    Node head; // head of the list

    // Linked list node
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;   
            this.next = null;   
        }
    }

    public static LinkedList insert(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head==null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currNode = list.head;

        System.out.println("LinkedList :");
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
 
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
 
        // Print the LinkedList
        printList(list);
    }
}


