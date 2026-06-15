class Solution {
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverse(a);
        a.next=head;
        return b;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        // Method 1

        // ListNode temp=head;
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(temp!=null)
        // {
        //     arr.add(temp.val);
        //     temp=temp.next;
        // }
        // int n=arr.size();
        // int i=0,j=n-1;
        // while(i<=j)
        // {
        //     if(!arr.get(i).equals(arr.get(j))) return false;
        //     i++;
        //     j--;
        // }
        // return true;

        //M-2
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null) // to stay at left middle
        {
           slow=slow.next;
           fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        ListNode i=head;
        ListNode j=head2;
        while(j!=null)
        {
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}