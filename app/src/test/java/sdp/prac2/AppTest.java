/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {
  @Test void task2no1(){
    //Arrange
     SimpleFunctions functions = new SimpleFunctions();
     List<String> arr1=  new ArrayList<>();
     arr1.add("cat");
     arr1.add("dog");
     List<String> expected = new ArrayList<>();
     expected.add("at");
     expected.add("og");
     //act
     List<String> result = functions.Task2(arr1);
     //assert
     assertIterableEquals(expected,result);

  }
  @Test void task2no2(){
    //Arrange
     SimpleFunctions functions = new SimpleFunctions();
     List<String> arr1=  new ArrayList<>();
     arr1.add(null);
     arr1.add("dog");
     List<String> expected = new ArrayList<>();
     expected.add("og");
     //act
     List<String> result = functions.Task2(arr1);
     //assert
     assertIterableEquals(expected,result);

  }
   @Test void task5no1() {
        //Arrange
        SimpleFunctions functions = new SimpleFunctions();
        List<Integer> a= Arrays.asList(4,7,2);
        List<Integer> expected = Arrays.asList(2,4,7);
        //act
        List<Integer> result = functions.Task5(a);
        //assert
        assertIterableEquals(expected, result);
    }

    @Test void task5no2() {
        //Arrange
        SimpleFunctions functions = new SimpleFunctions();
        List<Integer> a= Arrays.asList(11,21,23);
        List<Integer> expected = Arrays.asList(11,21,23);
        //act
        List<Integer> result = functions.Task5(a);
        //assert
        assertIterableEquals(expected, result);
    }
  @Test void testTask3() {
    //Arrange
    SimpleFunctions classBeingTested = new SimpleFunctions();
    String str = "((())";
    boolean expected = false;

    //Act
    boolean result = classBeingTested.Task3(str);
    
    //Asset
    assertEquals(expected, result);
  }

  @Test void testTask4() {
    //Arrange
    SimpleFunctions classBeingTested = new SimpleFunctions();
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(10);

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(6);
    list2.add(10);
    List<Integer> expected = new ArrayList<>();
    expected.add(10);
    expected.add(12);
    expected.add(10);
    
    //Act
    List<Integer> result = new ArrayList<>();
    result = classBeingTested.Task4(list1,list2);

    //Asset
    
        assertIterableEquals(expected, result);
  }
  @Test void testTask4no2() {
    //Arrange
    SimpleFunctions classBeingTested = new SimpleFunctions();
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(10);

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(10);
    List<Integer> expected = new ArrayList<>();
    expected.add(10);
    expected.add(12);
    expected.add(10);
    
    //Act
    List<Integer> result = new ArrayList<>();
    result = classBeingTested.Task4(list1,list2);

    //Asset
    
        assertIterableEquals(expected, null);
  }
    
}
