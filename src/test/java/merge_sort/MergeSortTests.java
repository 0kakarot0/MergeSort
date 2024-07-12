package merge_sort;

import org.testng.Assert;
import org.testng.annotations.Test;
import merge_sort.MergeSort;

import java.util.*;


public class MergeSortTests {

    //Test sorting an empty list.
    @Test(priority = -1, testName = "Sort Null List", description = "Test sorting an null list")
    public void mergeSortOnNullList() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = null;
        try {
            mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);
            Assert.fail("Expected NullPointerException was not thrown");
        } catch (NullPointerException e) {
            System.out.println("In catch");
            Assert.assertTrue(e instanceof NullPointerException, "Null pointer exception");
        }
    }

    @Test(priority = 0, testName = "Sort List Containing Null Values", description = "Test sorting an list containing null values")
    public void mergeSortListContainingNullValues() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = Arrays.asList("apple", null, "banana", null, "cherry");
        List<String> expectedArrayList = Arrays.asList(null, null, "apple", "banana", "cherry");

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);
        Assert.assertEquals(actualArrayList, expectedArrayList);


    }

    @Test(priority = 1, testName = "Sort Empty List", description = "Test sorting an empty list")
    public void mergeSortOnEmptyList() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = new ArrayList<>();
        List<String> expectedArrayList = new ArrayList<>();

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);

        Assert.assertEquals(actualArrayList, expectedArrayList);
    }

    @Test(priority = 2, testName = "Sort List With One String", description = "Test sorting an list with one String")
    public void mergeSortOnListWithOneString() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = List.of("Name");
        List<String> expectedArrayList = List.of("Name");


        mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);
        System.out.println(actualArrayList);

        Assert.assertEquals(actualArrayList, expectedArrayList);
    }

    @Test(priority = 3, testName = "Sort List Of String Numbers ", description = "Test sorting an list with String containing numbers")
    public void mergeSortOnListOfStringsNumbers() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = Arrays.asList("7", "1", "4", "6", "2", "5", "3");
        List<String> expectedArrayList = Arrays.asList("1", "2", "3", "4", "5", "6", "7");

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);

        Assert.assertEquals(actualArrayList.get(0), expectedArrayList.get(0));
    }


    @Test(priority = 4, testName = "Sort List Of Strings ", description = "Test sorting an list with Strings")
    public void mergeSortOnListOfStrings() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = Arrays.asList("golf", "cricket", "hockey", "esport", "chess", "swimming");
        int listSize = actualArrayList.size() - 1;
        List<String> expectedArrayList = Arrays.asList("chess", "cricket", "esport", "golf", "hockey", "swimming");

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList.get(0), expectedArrayList.get(0));
    }

    @Test(priority = 5, testName = "Sort List Of Integers ", description = "Test sorting an list with Integers")
    public void mergeSortOnListOfIntegers() {
        MergeSort<Integer> mergeSortListOfStrings = new MergeSort<>();
        List<Integer> actualArrayList = Arrays.asList(7, 1, 4, 6, 2, 5, 3);
        List<Integer> expectedArrayList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, actualArrayList.size() - 1);

        Assert.assertEquals(actualArrayList, expectedArrayList);
    }


    @Test(priority = 7, testName = "Sort List Of Double ", description = "Test sorting an list with Double")
    public void mergeSortOnListOfDouble() {
        MergeSort<Double> mergeSortListOfStrings = new MergeSort<>();
        List<Double> actualArrayList = Arrays.asList(7.12, 1.11, 4.44, 6.87, 2.2, 5.5, 0.3);
        int listSize = actualArrayList.size() - 1;
        List<Double> expectedArrayList = Arrays.asList(0.3, 1.11, 2.2, 4.44, 5.5, 6.87, 7.12);
        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList.get(2), expectedArrayList.get(2));
    }

    @Test(priority = 7, testName = "Sort List Of Characters ", description = "Test sorting an list with Characters")
    public void mergeSortOnListOfCharacters() {
        MergeSort<Character> mergeSortListOfStrings = new MergeSort<>();
        List<Character> actualArrayList = Arrays.asList('g', 'c', 'h', 'e', 'c', 's');
        int listSize = actualArrayList.size() - 1;
        List<Character> expectedArrayList = Arrays.asList('c', 'c', 'e', 'g', 'h', 's');

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList.get(2), expectedArrayList.get(2));
    }

    @Test(priority = 8, testName = "Sort Already Sorted List ", description = "Test sorting an list which is already sorted")
    public void mergeSortOnListOfCharactersAlreadySorted() {
        MergeSort<Character> mergeSortListOfStrings = new MergeSort<>();
        List<Character> actualArrayList = Arrays.asList('c', 'c', 'e', 'g', 'h', 's');
        int listSize = actualArrayList.size() - 1;
        List<Character> expectedArrayList = Arrays.asList('c', 'c', 'e', 'g', 'h', 's');

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList.get(2), expectedArrayList.get(2));
    }

    @Test(priority = 9, testName = "Sort List Of Duplicates Strings ", description = "Test sorting an list with Duplicates Strings")
    public void mergeSortOnListOfStringsWithDuplicates() {
        MergeSort<String> mergeSortListOfStrings = new MergeSort<>();
        List<String> actualArrayList = Arrays.asList("hockey", "chess", "hockey", "esport", "chess", "swimming");
        int listSize = actualArrayList.size() - 1;
        List<String> expectedArrayList = Arrays.asList("chess", "chess", "esport", "hockey", "hockey", "swimming");

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList, expectedArrayList);
    }

    @Test(priority = 10, testName = "Sort List Of Negative Integers ", description = "Test sorting an list with Negative Integers")
    public void mergeSortOnListOfNegativeIntegers() {
        MergeSort<Integer> mergeSortListOfStrings = new MergeSort<>();
        List<Integer> actualArrayList = Arrays.asList(-7, -1, -4, -6, -2, -5, -3);
        int listSize = actualArrayList.size() - 1;
        List<Integer> expectedArrayList = Arrays.asList(-7, -6, -5, -4, -3, -2, -1);


        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize);


        Assert.assertEquals(actualArrayList, expectedArrayList);
    }

    @Test(priority = 10, testName = "Sort List Of Negative and Positive Integers ", description = "Test sorting an list with Negative and Positive Integers")
    public void mergeSortOnNegativeAndPositiveIntegers() {
        MergeSort<Integer> mergeSortListOfStrings = new MergeSort<>();
        List<Integer> actualArrayList = Arrays.asList(-7, -1, 4, -6, -2, 0, 8);
        List<Integer> expectedArrayList = Arrays.asList(-7, -6, -2, -1, 0, 4, 8);
        int listSize = actualArrayList.size() - 1;

        mergeSortListOfStrings.mergeSort(actualArrayList, 0, listSize - 1);
        Assert.assertEquals(actualArrayList, expectedArrayList);
    }

    @Test(priority = 11, testName = "Sort List Of Negative Boundaries ", description = "Test sorting an list with Negative Boundaries")
    public void mergeSortOnNegativeBoundaries() {
        MergeSort<Integer> mergeSortListOfStrings = new MergeSort<>();
        List<Integer> actualArrayList = Arrays.asList(-7, -1, -4, -6, -2, -5, -3);
        List<Integer> expectedArrayList = Arrays.asList(-7, -6, -5, -4, -3, -2, -1);


        mergeSortListOfStrings.mergeSort(actualArrayList, -1, -1);


        Assert.assertNotEquals(actualArrayList, expectedArrayList);
    }

}

