import java.util.LinkedList;
import java.util.List;
public class TestMyLinkedList{
    public static void main(String[] args) {
        System.out.println("/=/=");
        MyLinkList ll=new MyLinkList(10);

        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.printList();
    }
}
