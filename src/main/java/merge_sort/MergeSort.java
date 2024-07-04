package merge_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hen");
        stringList.add("mouse");
        stringList.add("tiger");
        stringList.add("eagle");
        stringList.add("bull");
        stringList.add("alpha");
        stringList.add("cat");
        stringList.add("dog");

        System.out.println(stringList);
        System.out.println("\n");
        mergeSort(stringList, 0, stringList.size() - 1);
        System.out.println(stringList);
    }

    private static void mergeSort(List<String> stringList, int from, int to) {
        if (from == to) {
            return;
        }

        int mid = (from + to) / 2;

        mergeSort(stringList, from, mid);
        mergeSort(stringList, mid + 1, to);

        merge(stringList, from, mid, to);
    }

    private static void merge(List<String> stringList, int from, int mid, int to) {
        int totalElements = to - from + 1;
        List<String> temp = new ArrayList<>(Collections.nCopies(totalElements, null));

        int leftIndex = from;
        int rightIndex = mid + 1;
        int tempIndex = 0;

        while (leftIndex <= mid && rightIndex <= to) {
            if (stringList.get(leftIndex).compareTo(stringList.get(rightIndex)) < 0) {
                temp.set(tempIndex, stringList.get(leftIndex));
                leftIndex++;
            } else {
                temp.set(tempIndex, stringList.get(rightIndex));
                rightIndex++;
            }
            tempIndex++;
        }

        while (leftIndex <= mid) {
            temp.set(tempIndex, stringList.get(leftIndex));
            leftIndex++;
            tempIndex++;
        }

        while (rightIndex <= to) {
            temp.set(tempIndex, stringList.get(rightIndex));
            rightIndex++;
            tempIndex++;
        }

        for (int k = 0; k < totalElements; k++) {
            stringList.set(from + k, temp.get(k));
        }
    }
}
