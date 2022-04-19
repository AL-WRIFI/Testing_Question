import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RushHourTest {
    RushHour c;
    @Before
    public void setup() throws Exception{
        c= new RushHour();
        System.out.print("this method is running g0o0d");

    }


    @Test
    public void Boundrytest1(){
        String result =c.TrainTicketFare((float) 9.49);
        assertEquals("Full Fare",result);
    }
    @Test
    public void Boundrytest2(){
        String result =c.TrainTicketFare((float )9.51);
        assertEquals("Saver Ticket ",result);
    }
    @Test
    public void Boundrytest3(){
        String result =c.TrainTicketFare((float ) 19.49);
        assertEquals("Full Fare ",result);
    }
    @Test
    public void Boundrytest4(){
        String result =c.TrainTicketFare((float ) 19.51);
        assertEquals("Saver Ticket ",result);
    }

}
