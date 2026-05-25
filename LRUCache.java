import java.util.*;

public class LRUCache {
    int cacheCapacity = 5;
    int currentCapacity = 0;
    Node head = null;
    Node tail = null;

    Map<Integer, Node> cache = new HashMap<>();

    public void get(int key) {
        System.out.println();
        System.out.println("==========================================================");
        System.out.println("CACHE GET OPERATION");
        System.out.println("CPU Requests: " + key);
        Node s = cache.get(key);
        if (s == null) {

            System.out.println("Cache Status : Miss");
            System.out.println("Cached Data : -1");
            System.out.println("==========================================================");
        }

        else {
            System.out.println("Cache Status : Hit");
            System.out.println("Cached Data : " + s.value);
            System.out.println("==========================================================");
            if (s == tail) {
                tail = s;
            } else if (s == head) {
                Node oldTail = tail;
                tail.next = head;
                tail = head;
                tail.prev = oldTail;
                head = head.next;
                head.prev = null;
                tail.next = null;
            } else {
                s.prev.next = s.next;
                s.next.prev = s.prev;
                s.next = null;
                tail.next = s;
                s.prev = tail;
                tail = s;
            }
        }
        System.out.println();

    }

    public void put(int key, String value) {

        if (!cache.containsKey(key)) {
            Node newNode = new Node(key, value);

            if (currentCapacity != cacheCapacity) {

                if (head == null && tail == null) {
                    head = tail = newNode;
                    cache.put(newNode.key, newNode);
                    currentCapacity++;
                    System.out.println();
                    System.out.println("==========================================================");
                    System.out.println("CACHE PUT OPERATION");
                    System.out.println("Inserted Key : " + newNode.key);
                    System.out.println("Cached Data  : " + newNode.value);
                    System.out.println("Cache Status : SUCCESS");
                    System.out.println("==========================================================");

                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                    cache.put(newNode.key, newNode);
                    currentCapacity++;
                    System.out.println();
                    System.out.println("==========================================================");
                    System.out.println("CACHE PUT OPERATION");
                    System.out.println("Inserted Key : " + newNode.key);
                    System.out.println("Cached Data  : " + newNode.value);
                    System.out.println("Cache Status : SUCCESS");
                    System.out.println("==========================================================");

                }
            } else { // cache is full

                cache.remove(head.key);
                currentCapacity--;
                if (head.next == null) { // this is when cacheCapacity is 1
                    Node tempHead = head;
                    head = newNode;
                    tail = newNode;
                    cache.put(newNode.key, newNode);
                    currentCapacity++;
                    System.out.println();
                    System.out.println("==========================================================");
                    System.out.println("CACHE PUT OPERATION");
                    System.out.println("CACHE CAPACITY EXCEEDED ----> Initiating LRU Eviction Policy...");
                    System.out.println("Evicted Key : " + tempHead.key);
                    System.out.println("Inserted Key : " + newNode.key);
                    System.out.println("Cached Data  : " + newNode.value);
                    System.out.println("Cache Status : SUCCESS");
                    System.out.println("==========================================================");

                } else { // this is when cacheCapacity is > 1
                    Node tempHead = head;
                    head = head.next;
                    head.prev = null;
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                    cache.put(newNode.key, newNode);
                    currentCapacity++;
                    System.out.println();
                    System.out.println("==========================================================");
                    System.out.println("CACHE PUT OPERATION");
                    System.out.println("CACHE CAPACITY EXCEEDED ----> Initiating LRU Eviction Policy...");
                    System.out.println("Evicted Key : " + tempHead.key);
                    System.out.println("Inserted Key : " + newNode.key);
                    System.out.println("Cached Data  : " + newNode.value);
                    System.out.println("Cache Status : SUCCESS");
                    System.out.println("==========================================================");

                }

            }

        } else { // if same key is present then update its value and move the node to tail

            Node p = cache.get(key);
            p.value = value;
            if (p == tail) {
                tail = p;
            } else if (p == head) {
                Node oldTail = tail;
                tail.next = head;
                tail = head;
                tail.prev = oldTail;
                head = head.next;
                head.prev = null;
                tail.next = null;
            } else {
                p.prev.next = p.next;
                p.next.prev = p.prev;
                tail.next = p;
                p.prev = tail;
                p.next = null;
                tail = p;
            }

        }

    }

    public void displayCache() {
        System.out.println();
        System.out.println("==========================================================");
        System.out.println("Current Cache State:");
        Node s = head;
        while (s != null) {
            System.out.println("[key: " + s.key + ", Value: " + s.value + "]");
            s = s.next;
        }

        System.out.println("==========================================================");

    }

    public class Node {
        int key;
        String value;
        Node next = null;
        Node prev = null;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;

        }

    }
}