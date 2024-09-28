package Collection.Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Tạo danh sách các phần tử để thêm vào
        int elementCount = 1000000; // 1 triệu phần tử
        List<Integer> testData = new ArrayList<>();
        for (int i = 0; i < elementCount; i++) {
            testData.add(i);
        }

        // So sánh thời gian thêm phần tử
        // 1. Thêm vào HashSet
        Set<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int num : testData) {
            hashSet.add(num);
        }
        long endTime = System.nanoTime();
        System.out.println("Thời gian thêm vào HashSet: " + (endTime - startTime) / 1e6 + " ms");

        // 2. Thêm vào ArrayList
        List<Integer> arrayList = new ArrayList<>();
        startTime = System.nanoTime();
        for (int num : testData) {
            arrayList.add(num);
        }
        endTime = System.nanoTime();
        System.out.println("Thời gian thêm vào ArrayList: " + (endTime - startTime) / 1e6 + " ms");

        // So sánh thời gian tìm kiếm
        int searchElement = elementCount - 1;

        // 1. Tìm kiếm trong HashSet
        startTime = System.nanoTime();
        boolean foundInSet = hashSet.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("Thời gian tìm kiếm trong HashSet: " + (endTime - startTime) / 1e6 + " ms");

        // 2. Tìm kiếm trong ArrayList
        startTime = System.nanoTime();
        boolean foundInList = arrayList.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("Thời gian tìm kiếm trong ArrayList: " + (endTime - startTime) / 1e6 + " ms");

        // So sánh thời gian xoá phần tử
        // 1. Xoá trong HashSet
        startTime = System.nanoTime();
        hashSet.remove(searchElement);
        endTime = System.nanoTime();
        System.out.println("Thời gian xoá trong HashSet: " + (endTime - startTime) / 1e6 + " ms");

        // 2. Xoá trong ArrayList
        startTime = System.nanoTime();
        arrayList.remove((Integer) searchElement); // Cần ép kiểu sang Integer để xoá theo giá trị
        endTime = System.nanoTime();
        System.out.println("Thời gian xoá trong ArrayList: " + (endTime - startTime) / 1e6 + " ms");
    }
}
