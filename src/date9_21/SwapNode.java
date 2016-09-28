package date9_21;

/**
 * Created by I334189 on 9/21/2016.
 */
public class SwapNode {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while (head.next != null && head.next.next !=null){
            ListNode n1 = head.next;
            ListNode n2 = head.next.next;

            head.next = n2;
            n1.next = n2.next;
            n2.next = n1;

            head = n1;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        SwapNode swapNode = new SwapNode();

        ListNode node = new ListNode(0);
        node.printNode(swapNode.swapPairs(node1));
    }

}
