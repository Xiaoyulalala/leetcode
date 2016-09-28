package date9_21;

/**
 * Created by I334189 on 9/21/2016.
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public void printNode(ListNode node){
        while(node.next!=null){
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.println(node.val);
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.printNode(node1);
    }

}
