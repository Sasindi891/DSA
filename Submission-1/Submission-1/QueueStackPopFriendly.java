import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPopFriendly {

    Queue<Integer> q = new LinkedList<>();

    // Push is costly
    void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    // Pop is easy
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.remove();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly s = new QueueStackPopFriendly();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.pop());
    }
}
