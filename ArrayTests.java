import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseinPlace2(){
    int[] input1 = {1,2,3,4};
    int[] expected = {4,3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
    System.out.println(input1);
  }

  @Test
  public void testReversed2(){
    int[] input1 = {1,2,3,4};
    int[] expected = {4,3,2,1};
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
    System.out.println(ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowestTest(){
    double[] input = {5.0,6.0,5.0,5.0};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(6.0, result, 0.1);
  } 

  @Test
  public void averageWithoutLowestTest2(){
    double[] input = {};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0, result, 0.0000001);
  } 

  @Test
  public void averageWithoutLowestTest3(){
    double[] input = {4.0};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0, result, 0.00000001);
  } 

  @Test
  public void averageWithoutLowestTest4(){
    double[] input = {1.0,6.0,5.0,5.0};
    double result = ArrayExamples.averageWithoutLowest(input);
    assertEquals(5.3, result, 0.1);
  } 
}



