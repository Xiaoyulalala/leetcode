package date9_21;

/**
 * Created by I334189 on 9/21/2016.
 */
public class ReverseKNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        int length = getListLength(head);
        if(k>length) return head;
        // head = dummy;
        ListNode endNode = head;
        int count = 1;
        while(endNode.next != null){
            if(count>=(k)){
                break;
            }
            ListNode tempHead = endNode.next;
            endNode.next = endNode.next.next;
            tempHead.next = head;
            head = tempHead;
            count++;
            
        }
        String a = new String("aASASA");
        String s = a.toLowerCase();
        return head;
    }

    private int getListLength(ListNode node){
        int length = 1;
        if(node == null){
            return 0;
        }
        while(node.next!=null){
            node = node.next;
            length++;
        }
        return length;
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

        ReverseKNodes reverseKNodes = new ReverseKNodes();
        ListNode node = new ListNode(0);
        node.printNode(reverseKNodes.reverseKGroup(node1,1));
    }

}
