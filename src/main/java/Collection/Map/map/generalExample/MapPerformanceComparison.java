package Collection.Map.map.generalExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapPerformanceComparison {

    public static void main(String[] args) {
        int dataSize = 100000;
        long startTime, endTime;

        // HashMap
//        Map<Integer, Integer> hashMap = new HashMap<>(120000, 0.9f);
        Map<Integer, Integer> hashMap = new HashMap<>();
        System.out.println("HashMap Performance:");

        // Put Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            hashMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("Put: " + (endTime - startTime)/1000 + " micro seconds");

        // Get Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            hashMap.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Get: " + (endTime - startTime)/1000 + " micro seconds");

        // Iterate (For-each) Operation
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            // Do nothing, just iterate
        }
        endTime = System.nanoTime();
        System.out.println("Iterate: " + (endTime - startTime)/1000 + " micro seconds");

        // Remove Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            hashMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Remove: " + (endTime - startTime)/1000 + " micro seconds");

        System.out.println("------------------------");

        // LinkedHashMap
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("LinkedHashMap Performance:");

        // Put Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedHashMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("Put: " + (endTime - startTime)/1000 + " micro seconds");

        // Get Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedHashMap.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Get: " + (endTime - startTime)/1000 + " micro seconds");

        // Iterate (For-each) Operation
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : linkedHashMap.entrySet()) {
            // Do nothing, just iterate
        }
        endTime = System.nanoTime();
        System.out.println("Iterate: " + (endTime - startTime)/1000 + " micro seconds");

        // Remove Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            linkedHashMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Remove: " + (endTime - startTime)/1000 + " micro seconds");

        System.out.println("------------------------");

        // TreeMap
        Map<Integer, Integer> treeMap = new TreeMap<>();
        System.out.println("TreeMap Performance:");

        // Put Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            treeMap.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("Put: " + (endTime - startTime)/1000 + " micro seconds");

        // Get Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            treeMap.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Get: " + (endTime - startTime)/1000 + " micro seconds");

        // Iterate (For-each) Operation
        startTime = System.nanoTime();
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            // Do nothing, just iterate
        }
        endTime = System.nanoTime();
        System.out.println("Iterate: " + (endTime - startTime)/1000 + " micro seconds");

        // Remove Operation
        startTime = System.nanoTime();
        for (int i = 0; i < dataSize; i++) {
            treeMap.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Remove: " + (endTime - startTime)/1000 + " micro seconds");
    }
}

