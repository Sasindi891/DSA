import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }
    }

    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q.remove();
    }

    public static void main(String[] args) {
        StackQueue s = new StackQueue();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}
