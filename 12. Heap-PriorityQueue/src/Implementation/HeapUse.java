package Implementation;

public class HeapUse {
    public static void main(String[] args) throws Exception{
        Heap<Integer>  heap = new Heap<>();
        heap.insert(14);
        heap.insert(23);
        heap.insert(23);
        heap.insert(25);
        heap.insert(27);
        heap.insert(55);

        System.out.println(heap.remove());
        System.out.println(heap.heapSort());
    }
}
