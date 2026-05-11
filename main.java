public class main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.put(1, "monish");
        cache.put(2, "Tanish");
        cache.put(3, "Om");
        cache.put(4, "Hema");
        cache.put(5, "rani");
        cache.put(6, "Monu");
        cache.put(7, "sonu");
        cache.put(6, "Monish");
        cache.put(7, "Tanish");
        cache.displayCache();
        cache.get(3);
        cache.displayCache();
        cache.get(88);

    }

}
