package merge_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSort<T extends Comparable<T>> {

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
        MergeSort<String> mergeSort = new MergeSort<>();
        mergeSort.mergeSort(stringList, 0, stringList.size() - 1);
        System.out.println(stringList);
    }

    public void mergeSort(List<T> stringList, int from, int to) {
        if (!stringList.isEmpty() && to != -1 && from != -1) {
            if (from == to) {
                return;
            }

            int mid = (from + to) / 2;

            mergeSort(stringList, from, mid);
            mergeSort(stringList, mid + 1, to);

            merge(stringList, from, mid, to);
        } else {
            System.out.println("Not A Valid List");
        }
    }

    private void merge(List<T> stringList, int from, int mid, int to) {
        int totalElements = to - from + 1;
        List<T> temp = new ArrayList<>(Collections.nCopies(totalElements, null));

        int leftIndex = from;
        int rightIndex = mid + 1;
        int tempIndex = 0;

        // Merge elements into temp list
        while (leftIndex <= mid && rightIndex <= to) {
            T leftElement = stringList.get(leftIndex);
            T rightElement = stringList.get(rightIndex);


            if (leftElement == null) {
                temp.set(tempIndex, leftElement);
                leftIndex++;
            } else if (rightElement == null) {
                temp.set(tempIndex, rightElement);
                rightIndex++;
            } else if (leftElement.compareTo(rightElement) < 0) {
                temp.set(tempIndex, leftElement);
                leftIndex++;
            } else {
                temp.set(tempIndex, rightElement);
                rightIndex++;
            }
            tempIndex++;
        }

        // Copy remaining elements from left subarray
        while (leftIndex <= mid) {
            temp.set(tempIndex, stringList.get(leftIndex));
            leftIndex++;
            tempIndex++;
        }

        // Copy remaining elements from right subarray
        while (rightIndex <= to) {
            temp.set(tempIndex, stringList.get(rightIndex));
            rightIndex++;
            tempIndex++;
        }

        // Copy sorted elements back to original list
        for (int k = 0; k < totalElements; k++) {
            stringList.set(from + k, temp.get(k));
        }
    }
}
