public class LinkedList {
    Node head;

    public void insert(int val){
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
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.val);
        }
        System.out.println(node.val);
    }
}
