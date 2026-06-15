 class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode slow=head;
        // ListNode fast=head;
        // while(fast!=null && fast.next!=null) 
        // {
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     if(slow==fast) return true;
        // }
        // return false;
        
        //Method 2 (fast increases by 3)
        //we can increase fast by any times but according to that while condition changes
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null) 
        {
            slow=slow.next;
            fast=fast.next.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}