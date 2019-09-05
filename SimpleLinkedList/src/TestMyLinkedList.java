public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("-----Testing-----");
        MyLinkedList linkedList = new MyLinkedList(14);
        linkedList.addFirst(13);
        linkedList.addFirst(12);
        linkedList.addFirst(11);
        linkedList.addFirst(10);

        linkedList.add(5, 9);
        linkedList.add(6, 15);

        linkedList.printList();
    }
}
