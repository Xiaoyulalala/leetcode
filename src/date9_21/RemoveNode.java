package date9_21;

public class RemoveNode{

    public RemoveNode(){}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)
            return head;
        int fastPtr = 0;
        int slowPtr = -n;
        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode retNode = slowNode;
        while(fastNode.next!=null){
            if(slowPtr<0){
                fastNode = fastNode.next;
                fastPtr++;
                slowPtr++;
            }else{
                fastNode = fastNode.next;
                slowNode = slowNode.next;
                fastPtr++;
                slowPtr++;
            }
        }
        if(slowPtr>=0){
            slowNode.next = slowNode.next.next;
        }else if(slowPtr==-1){
            retNode = head.next;
        }else{
            retNode = null;
        }
        
        return retNode;
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

        RemoveNode removeNode = new RemoveNode();

        ListNode node = new ListNode(0);
        node.printNode(removeNode.removeNthFromEnd(node1,0));
    }
}