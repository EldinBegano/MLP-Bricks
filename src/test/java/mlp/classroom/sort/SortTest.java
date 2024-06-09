//package mlp.classroom.sort;
//
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SortTest {
//
//    @Order(1)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class BubbleSort {
//        @Test
//        void testBubbleSortInteger() {
//            Bubble<Integer> bubbleSort = new Bubble<>();
//            Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
//            Integer[] expectedSortedArr = {11, 12, 22, 25, 34, 64, 90};
//
//            bubbleSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//
//        @Test
//        void testBubbleSortString() {
//            Bubble<String> bubbleSort = new Bubble<>();
//            String[] arr = {"banana", "apple", "cherry", "date", "grape"};
//            String[] expectedSortedArr = {"apple", "banana", "cherry", "date", "grape"};
//
//            bubbleSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//    }
//    @Order(2)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class InsertionSort {
//        @Test
//        @Order(1)
//        void testInsertionSortInteger() {
//            Insertion<Integer> insertionSort = new Insertion<>();
//            Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
//            Integer[] expectedSortedArr = {11, 12, 22, 25, 34, 64, 90};
//
//            insertionSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//
//        @Test
//        @Order(2)
//        void testInsertionSortString() {
//            Insertion<String> insertionSort = new Insertion<>();
//            String[] arr = {"banana", "apple", "cherry", "date", "grape"};
//            String[] expectedSortedArr = {"apple", "banana", "cherry", "date", "grape"};
//
//            insertionSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//    }
//
//    @Order(3)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class SelectionSort {
//        @Test
//        @Order(5)
//        void testSelectionSortInteger() {
//            Selection<Integer> selectionSort = new Selection<>();
//            Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
//            Integer[] expectedSortedArr = {11, 12, 22, 25, 34, 64, 90};
//
//            selectionSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//
//        @Test
//        @Order(6)
//        void testSelectionSortString() {
//            Selection<String> selectionSort = new Selection<>();
//            String[] arr = {"banana", "apple", "cherry", "date", "grape"};
//            String[] expectedSortedArr = {"apple", "banana", "cherry", "date", "grape"};
//
//            selectionSort.sort(arr);
//
//            assertArrayEquals(expectedSortedArr, arr, "Array should be sorted");
//        }
//    }
//}