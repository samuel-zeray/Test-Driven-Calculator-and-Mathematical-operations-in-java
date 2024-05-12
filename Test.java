import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {
    
    @Test
    public void testpower (){
        Calculator p= new Calculator();
         assertEquals(8.0, p.power(2.0,3.0));
    }


}
