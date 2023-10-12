
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import testingsubject.StudentStatistics;

/**
 * @author rasaz
 */

public class StudentStatisticsTest {
    
    public double[] data;
    public int maxLength;
    public StudentStatistics Object;
    
    public StudentStatisticsTest() {
    }
    
    @Before
    public void setUp() {
        Object = new StudentStatistics();
    }
    
    @After
    public void tearDown() {
        Object=null;
    }
    
    //TU01
    @Test  
    public void noModeTest(){
        double arr[]={88,45,77,98};
        assertNull(Object.calculateMode(arr));
    }
    
    //TU02
    @Test
    public void ascendingOrderArrayTest(){
        double messOrder[]={88.8,45,77,98,5,63,100,44};
        double actual[]=Object.selectionSort(messOrder);
        double correctOrder[]={5,44,45,63,77,88.8,98,100};
      
         for (int i=0; i<correctOrder.length; i++) 
             assertTrue(correctOrder[i] == actual[i]);
    }
    
    //TU03
    @Test 
    public void ModeTest(){
        double arr[]={88,78,95,40,95};
        assertTrue(95==Object.calculateMode(arr));
        
    }
    
    //TU04
    @Test
    (expected = NoSuchElementException.class)
    public void studentNumberIsZeroTest(){
        maxLength =0;
        assertNull(Object.studentNumber(maxLength));
        
    }
    
    //TU05
    @Test
    public void calculateMean(){
        double arr[]={30,10,40,20};
        assertTrue(25.0==Object.calculateMean(arr));
    }
    
    //TU06
    @Test
    public void calculateMedianWhenOdd(){
        double arr[]={10,20,50,90,100};
        assertTrue(50==Object.calculateMedian(arr));
    }
    
    //TU07
    @Test
    public void calculateMedianWhenEven(){
        double arr[]={10,20,50,80,90,100};
        assertTrue(65.0==Object.calculateMedian(arr));
    }
    
}
