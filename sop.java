import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
    }
}

public class Positive{

  public static int sum(int[] arr){
    int sum1 = 0;
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
      if(arr[i] < 0){
        
      }else{
        sum1 += arr[i];
      }
        
 
    }
    
    return sum1;
  }

}
