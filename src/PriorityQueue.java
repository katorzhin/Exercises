import java.util.Arrays;

public class PriorityQueue {
    private int[] priorityQueue;
    int count;

    public PriorityQueue(int sizeArray) {
        priorityQueue = new int[sizeArray];
        count = 0;
    }

    public void add(int element) {
        priorityQueue[count++] = element;
    }

    public void remove() {
        priorityQueue[count - 1] = 0;
        count--;
    }

    public static void main(String[] args) {
        PriorityQueue array = new PriorityQueue(7);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.remove();
        array.remove();
        array.remove();
        array.remove();
        System.out.println(Arrays.toString(array.priorityQueue));
    }
}
