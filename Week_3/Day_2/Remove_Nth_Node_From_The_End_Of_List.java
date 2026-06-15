class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        if(fast==null) return head.next;  //if k==n
        while(fast.next!=null)  //fast.next is used to stop one before
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}