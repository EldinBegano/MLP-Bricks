//package mlp.classroom.collections;
//
//
//import org.junit.jupiter.api.*;
//
//
//import java.util.EmptyStackException;
//
//import static org.assertj.core.api.Assertions.*;
//
//
//@TestClassOrder(ClassOrderer.OrderAnnotation.class)
//class CollectionsTest {
//
//    private static MyList<Integer> myList;
//    private static MyMap<String, Integer> myMap;
//    private static MySet<Integer> mySet = new MySet<>();
//    private static MyStack<Integer> myStack = new MyStack<>();
//
//    @BeforeEach
//    void setup() {
//        myList = new MyList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        myMap = new MyMap<>();
//        myMap.put("One", 1);
//        myMap.put("Two", 2);
//        myMap.put("Three", 3);
//
//        mySet = new MySet<>();
//        mySet.add(10);
//        mySet.add(20);
//        mySet.add(10);
//
//        myStack = new MyStack<>();
//
//        myStack.add(10);
//        myStack.add(20);
//        myStack.add(30);
//    }
//    @Order(1)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe1  {
//        @Order(1000)
//        @Test
//        void testGetElementAtIndexOfMyList() {
//            assertThat(myList.get(0)).isEqualTo(10);
//            assertThat(myList.get(1)).isEqualTo(20);
//        }
//
//        @Order(1200)
//        @Test
//        void testRemoveElementOfMyList() {
//            myList.remove(1);
//            assertThat(myList.size()).isEqualTo(2);
//        }
//
//        @Order(1300)
//        @Test
//        void testSizeAfterRemovalOfMyList() {
//            myList.remove(1);
//            assertThat(myList.size()).isEqualTo(2);
//        }
//
//        @Order(1400)
//        @Test
//        void testIsEmptyOfMyList() {
//            assertThat(myList.isEmpty()).isEqualTo(false);
//        }
//        @Order(1500)
//        @Test
//        void testGetElementAfterRemovalOfMyList() {
//            myList.remove(1);
//            assertThat(myList.get(1)).isEqualTo(30);
//        }
//    }
//
//    @Order(2)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe2 {
//        @Test
//        @Order(1)
//        void testGetElementOfMyMap() {
//            assertThat(myMap.get("Two")).isEqualTo(2);
//        }
//
//        @Test
//        @Order(2)
//        void testContainsKeyOfMyMap() {
//            assertThat(myMap.containsKey("Three")).isTrue();
//        }
//
//        @Test
//        @Order(3)
//        void testSizeOfMyMap() {
//            assertThat(myMap.size()).isEqualTo(3);
//        }
//
//        @Test
//        @Order(4)
//        void testRemoveElementOfMyMap() {
//            myMap.remove("Two");
//            assertThat(myMap.containsKey("Two")).isFalse();
//            assertThat(myMap.size()).isEqualTo(2);
//        }
//    }
//    @Order(3)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe3 {
//        @Test
//        @Order(1)
//        void testPeek() {
//            assertThat(myStack.peek()).isEqualTo(30);
//        }
//
//        @Test
//        @Order(2)
//        void testPop() {
//            assertThat(myStack.pop()).isEqualTo(30);
//            assertThat(myStack.pop()).isEqualTo(20);
//        }
//
//        @Test
//        @Order(3)
//        void testPeekAfterPop() {
//            myStack.pop();
//            assertThat(myStack.peek()).isEqualTo(20);
//        }
//
//        @Test
//        @Order(4)
//        void testEmpty() {
//            assertThat(myStack.empty()).isFalse();
//            myStack.pop();
//            myStack.pop();
//            myStack.pop();
//            assertThat(myStack.empty()).isTrue();
//        }
//
//        @Test
//        @Order(5)
//        void testSearch() {
//            assertThat(myStack.search(10)).isEqualTo(3);
//            assertThat(myStack.search(100)).isEqualTo(-1);
//        }
//
//        @Test
//        @Order(6)
//        void testPopEmptyStack() {
//            myStack.pop();
//            myStack.pop();
//            assertThatThrownBy(myStack::pop).isInstanceOf(EmptyStackException.class);
//        }
//
//        @Test
//        @Order(7)
//        void testPeekEmptyStack() {
//            myStack.pop();
//            myStack.pop();
//            assertThatThrownBy(myStack::peek).isInstanceOf(EmptyStackException.class);
//        }
//    }
//    @Order(4)
//    @Nested
//    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//    class Aufgabe4 {
//        @Test
//        void testContains() {
//            assertThat(mySet.contains(10)).isTrue();
//            assertThat(mySet.contains(30)).isFalse();
//        }
//
//        @Test
//        void testRemove() {
//            assertThat(mySet.remove(10)).isTrue();
//            assertThat(mySet.remove(30)).isFalse();
//        }
//
//        @Test
//        void testSizeAfterRemoval() {
//            mySet.remove(10);
//            mySet.remove(30);
//            assertThat(mySet.size()).isEqualTo(1);
//        }
//
//        @Test
//        void testIsEmpty() {
//            assertThat(mySet.isEmpty()).isFalse();
//            mySet.remove(10);
//            mySet.remove(20);
//            mySet.remove(30);
//            assertThat(mySet.isEmpty()).isTrue();
//        }
//    }
//
//}
