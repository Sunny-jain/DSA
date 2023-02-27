class Main {
    public static void main(String []args) {
        LinkedList list = new LinkedList();

        list.insert(4);
        list.insert(8);
        list.insert(5);
        list.insert(7);
        list.insertPosi(6, 2);
        list.insertFirst(1);
        list.deleteNode(4);
        list.show();
    }   
}