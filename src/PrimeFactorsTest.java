import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * PrimeFactorsTest
 */
public class PrimeFactorsTest {

    // @param values
    // @return 

  private static List<Integer> factorsOf(int value){
    PrimeFactors primeFactors = new PrimeFactors();
    return primeFactors.resolve(value);
  }

    public static List<Integer> listOf(int... values){
        List<Integer> result = new ArrayList<Integer>();
        for(int value : values){
            result.add(value);
        }
        return result;
    }
      @Test
    public void testOne(){
        List<Integer> expected = listOf();
        List<Integer> actual = factorsOf(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwo(){
        List<Integer> expected = listOf(2);
        List<Integer> actual = factorsOf(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testThre() {
        assertEquals(listOf(3), factorsOf(3));
    }
    
}