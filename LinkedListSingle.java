public class LinkedListSingle {
    Node head;
    private int size;

    LinkedListSingle() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            // if head is null then head become newNode
            head = newNode;
            return;
        }

        // then we point next of newNode is head
        newNode.next = head;
        // head becomes newNode means first node
        head = newNode;
    } 

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        // currNode means first node because head is first node
        Node currNode = head;

        // we traverse linkelist from first node to end till we found currNode next is null
        while (currNode.next != null) {
            currNode = currNode.next;  // we found last node(null) and becomes currnode next
        }

        currNode.next = newNode;  // then currnode next becomes newnode means add newnode at last of LL
    }

    // print
    public void printList(){
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " => ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // delete first
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next; // we point head is head.next measn 2 node become head and 1 node remove
    }

    // delete last
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;

        // if linkedlist have only 1 node then remove first node
        if (head.next == null) {
            head = null; 
            return;
        }

        Node secondLast = head; // first secoundLast node is our head
        Node lastNode = head.next; 

        // we traverse from first to last node or till we found lastnode.next is null
        while (lastNode.next != null) {
            lastNode = lastNode.next; 
            secondLast = secondLast.next;
        }

        secondLast.next = null;  // remove the last node
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListSingle list = new LinkedListSingle();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        list.addFirst("This");
        list.printList();

        System.out.println(list.getSize());
    }
}