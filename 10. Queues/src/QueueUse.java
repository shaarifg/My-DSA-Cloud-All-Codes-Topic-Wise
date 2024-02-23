public class QueueUse {
    public static void main(String[] args) {
//        CustomQueue queue = new CustomQueue(3);
        CustomQueue queue = new CustomQueue(3);

        queue.insert(3);
        queue.insert(33);
        queue.insert(32);

        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        queue.display();
    }
}
