public class Queue {
    Node head;
    public static void enqueue(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
}
