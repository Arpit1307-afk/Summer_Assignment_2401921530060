class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        //Method 1 (Using ArrayList)

        // ListNode temp=head;
        // ArrayList<ListNode> arr=new ArrayList<>();
        // while(temp!=null)
        // {
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int n=arr.size();
        // for(int i=n-1;i>=1;i--) arr.get(i).next=arr.get(i-1);
        // arr.get(0).next=null;
        // return arr.get(n-1);

        //Method 2 (rearranging the nodes/ 3 pointer approach)
        // ListNode pre=null;
        // ListNode curr=head;
        // ListNode nextNode=head;
        // while(nextNode!=null)
        // {
        //     nextNode=nextNode.next;
        //     curr.next=pre;
        //     pre=curr;
        //     curr=nextNode;
        // }
        // return pre;

        //M-3(using recursion)
        ListNode a=head.next;
        head.next=null;
        ListNode b=reverseList(a);
        a.next=head;
        return b;
    }
}