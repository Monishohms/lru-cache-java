public class main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.put(101, "User_Profile_Response");
        cache.put(102, "Product_Catalog");
        cache.put(103, "Recommendation_Data");
        cache.put(104, "Session_Metadata");
        cache.put(105, "Payment_Service_Config");

        cache.get(103);
        cache.get(106);
        cache.displayCache();

        cache.put(106, "Analytics_Dashboard_Data");
        cache.displayCache();

    }

}
