package implementationUsingLinkedList;

public class MapUse {
    public static void main(String[] args) {
        Map<String, Integer> map =new Map<>();
        for (int i = 1; i <= 20; i++) {
            map.insert("abc"+i, i);
            System.out.println(map.loadFactor());
        }
        System.out.println(map.get("abc9"));
        System.out.println(map.remove("abc9"));
        System.out.println(map.get("abc9"));
        System.out.println(map.size());
    }

    /*
        Happy Learning My Code is Working Fine😊😎🔥🛩️🚀;
    */
}
