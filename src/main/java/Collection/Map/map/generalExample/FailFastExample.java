package Collection.Map.map.generalExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastExample {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
//        Map<String, String> countryMap = new LinkedHashMap<>();
//        Map<String, String> countryMap = new TreeMap<>();
//        Map<String, String> countryMap = new Hashtable<>();
//        Map<String, String> countryMap = new ConcurrentHashMap<>();

        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Vietnam", "Hanoi");

        for (Map.Entry<String, String> entry : countryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            // Thêm phần tử trong quá trình duyệt dẫn đến ConcurrentModificationException
            countryMap.put("France" + entry.getKey(), "Paris");
        }

        System.out.println(countryMap);

        /*
         * In the forEach method, the Consumer processes each entry in the Map.
         * When you call put inside the Consumer, it modifies the Map, which can
         * lead to a ConcurrentModificationException.
         * However, the forEach method will still process all the entries
         * that existed before the modification.
         */
//        countryMap.forEach((key, value) -> {
//            System.out.println(key + ": " + value);
//            countryMap.put("France", "Paris");
//        });
    }
}

