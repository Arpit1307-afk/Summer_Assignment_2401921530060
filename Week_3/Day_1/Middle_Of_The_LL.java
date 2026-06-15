class Solution {
    public ListNode middleNode(ListNode head) {
        // int count=0;
        // ListNode temp=head;
        // while(temp!=null)
        // {
        //     count++;
        //     temp=temp.next;
        // }
        // temp=head;
        // int idx=(count)/2;
        // for(int i=1;i<=idx;i++)  temp=temp.next;
        //return temp;

        //Method - II
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){  //to stop at middle(right one)
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}