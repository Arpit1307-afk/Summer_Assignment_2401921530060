import java.util.*;
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
      // q = new LinkedList<>(); 
       q = new ArrayDeque<>();  //little faster
    }
    
    public int ping(int t) {
        q.add(t);
        int L=(t-3000);
        while(q.peek()<L) q.remove();
        return q.size();
    }
}