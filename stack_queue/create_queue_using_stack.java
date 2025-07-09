package stack_queue;
import java.util.Stack;

public class  create_queue_using_stack  {
    Stack<Integer> stack1 = new Stack<>(); // For enqueue
    Stack<Integer> stack2 = new Stack<>(); // For dequeue

    // Enqueue operation
    public void enqueue(int item) {
        stack1.push(item);
        System.out.println("Enqueued: " + item);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main to test
    public static void main(String[] args) {
    	create_queue_using_stack  queue = new  create_queue_using_stack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is empty? " + queue.isEmpty());
    }
}

 
