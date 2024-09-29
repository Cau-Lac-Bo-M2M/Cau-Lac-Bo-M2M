package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPerformanceComparison {

    public static void main(String[] args) {
        int elementCount = 100000; // 1 trăm nghìn
        long startTime, endTime;

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian thêm vào HashSet: " + (endTime - startTime) / 1_000_000.0 + " ms"); // 1 mili giây (ms) = 1,000,000 nano giây (ns)
                                                                                                            // 1 giây = 1 tỷ (1,000,000,000) nano giây
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian tìm kiếm trong HashSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian xóa khỏi HashSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        System.out.println();

        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedHashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian thêm vào LinkedHashSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedHashSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian tìm kiếm trong LinkedHashSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedHashSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian xóa khỏi LinkedHashSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        System.out.println();

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian thêm vào TreeSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            treeSet.contains(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian tìm kiếm trong TreeSet: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            treeSet.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian xóa khỏi TreeSet: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
