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
            node = node.next;
        }
        System.out.println(node.val);
    }

    public void insertPosi(int val, int position) {
        Node newNode = new Node(val);

        Node node = head;
        while(node.next != null && position > 1){
            node = node.next;
            position--;
        }
        newNode.next = node.next;
        node.next = newNode;
    }

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int val){
        
    }
}