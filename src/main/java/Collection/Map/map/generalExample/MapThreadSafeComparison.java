package Collection.Map.map.generalExample;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapThreadSafeComparison {

    public static void main(String[] args) throws InterruptedException {
        int dataSize = 100000;
        int threadCount = 10;
        long startTime, endTime;

        // Hashtable
        Map<Integer, Integer> hashtable = new Hashtable<>();
        System.out.println("Hashtable Performance (Multi-threaded):");

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        // Put Operation
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    hashtable.put(j, j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Put: " + (endTime - startTime)/1e3 + " micro seconds");

        // Get Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    hashtable.get(j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Get: " + (endTime - startTime)/1e3 + " micro seconds");

        // Iterate (For-each) Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (Map.Entry<Integer, Integer> entry : hashtable.entrySet()) {
                    // Do nothing, just iterate
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Iterate: " + (endTime - startTime)/1e3 + " micro seconds");

        // Remove Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    hashtable.remove(j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Remove: " + (endTime - startTime)/1e3 + " micro seconds");

        System.out.println("------------------------");

        // ConcurrentHashMap
        Map<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();
        System.out.println("ConcurrentHashMap Performance (Multi-threaded):");

        // Put Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    concurrentMap.put(j, j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Put: " + (endTime - startTime)/1e3 + " micro seconds");

        // Get Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    concurrentMap.get(j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Get: " + (endTime - startTime)/1e3 + " micro seconds");

        // Iterate (For-each) Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (Map.Entry<Integer, Integer> entry : concurrentMap.entrySet()) {
                    // Do nothing, just iterate
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Iterate: " + (endTime - startTime)/1e3 + " micro seconds");

        // Remove Operation
        executor = Executors.newFixedThreadPool(threadCount);
        startTime = System.nanoTime();
        for (int i = 0; i < threadCount; i++) {
            executor.execute(() -> {
                for (int j = 0; j < dataSize / threadCount; j++) {
                    concurrentMap.remove(j);
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        endTime = System.nanoTime();
        System.out.println("Remove: " + (endTime - startTime)/1e3 + " micro seconds");
    }
}

