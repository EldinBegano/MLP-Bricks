//package mlp.classroom.search;
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SearchTest {
//
//    @Order(1)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe1  {
//        @Order(1)
//        @Test
//        void testBinarySearchElementPresent() {
//            Binary binary = new Binary();
//            int[] arr = {2, 3, 4, 10, 40};
//            int target = 10;
//
//            int result = binary.search(arr, target);
//
//            assertEquals(3, result, "Element found at index 3");
//        }
//        @Order(2)
//        @Test
//        void testBinarySearchElementNotPresent() {
//            Binary binary = new Binary();
//            int[] arr = {2, 3, 4, 10, 40};
//            int target = 20;
//
//            int result = binary.search(arr, target);
//
//            assertEquals(-1, result, "Element not present in the array");
//        }
//    }
//    @Order(20)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe2  {
//        @Order(100)
//        @Test
//        void testLinearSearchElementPresent() {
//            Linear linear = new Linear();
//            int[] arr = {2, 3, 4, 10, 40};
//            int target = 10;
//
//            int result = linear.search(arr, target);
//
//            assertEquals(3, result, "Element found at index 3");
//        }
//        @Order(200)
//        @Test
//        void testLinearSearchElementNotPresent() {
//            Linear linear = new Linear();
//            int[] arr = {2, 3, 4, 10, 40};
//            int target = 20;
//
//            int result = linear.search(arr, target);
//
//            assertEquals(-1, result, "Element not present in the array");
//        }
//    }
//
//}
