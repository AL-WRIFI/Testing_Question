import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatIntrerestTest {
    CalculatIntrerest c;
    @Before
    public void setup() throws Exception{
        c= new CalculatIntrerest();
        System.out.print("this method is running g0od");

    }
    @Test(expected = IllegalArgumentException.class)
  public void BoundryTest1(){
      double result =c.AccountIntreset(-0.01);
      assertEquals(00,result,0.000005);
  }

    @Test
    public void Boundrytest2(){
        double result =c.AccountIntreset(0.00);
        assertEquals(0,result,0.000005);
    }
    @Test
    public void Boundrytest3(){
        double result =c.AccountIntreset(100.00);
        assertEquals(3,result,0.000005);
    }
    @Test
    public void Boundrytest4(){
        double result =c.AccountIntreset(100.01);
        assertEquals(5.0005,result,0.000500000000001);
    }
    @Test
    public void Boundrytest5(){
        double result =c.AccountIntreset(999.99);
        assertEquals(49.9995,result,0.999500000000005);
    }
    @Test
    public void Boundrytest6(){
        double result =c.AccountIntreset(1000.00);
        assertEquals(70,result,0.0000);
    }
    //this is the equavelant e partition
    @Test(expected = IllegalArgumentException.class)
    public void EquavPartTest1(){
        double result =c.AccountIntreset(-20);
        assertEquals(00,result,0.00000);
    }
    @Test
    public void EquavPartTest2(){
        double result =c.AccountIntreset(50);
        assertEquals(1.5,result,0.00000);
    }
    @Test
    public void EquavPartTest3(){
        double result =c.AccountIntreset(300);
        assertEquals(15 ,result,0.00000);
    }


    @Test
    public void EquavPartTest4(){
        double result =c.AccountIntreset(1200);
        assertEquals(84,result,00000000000001);
    }
}