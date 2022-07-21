package taskOOP;

public class MyLinkedList {
    int size;
    Node head = null;




   private class Node {
        int value;
        Node next = null;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



}
