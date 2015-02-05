


import controller.morpork.AnkhMorpork;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.Bank;


/**
 *
 *Creating test case for AnkhMorpork class
 */
public class AnkhMorporkTest {
    
    AnkhMorpork a=new AnkhMorpork();
    Bank b=new Bank();
      
    public AnkhMorporkTest() {
       
    }
    /**
     * Testcase for shuffle cards
     */
    @Test 
    public void test1()
    { 
  assertTrue(a.shuffleCards(2));
  //System.out.println("1");
    }
    
    @Test 
    public void test2()
    { 
  assertTrue(a.shuffleCards(3));
  //System.out.println("2");  
    }
    
    @Test 
    public void test3()
    { 
  assertEquals(true,a.shuffleCards(4));
    //System.out.println("3");
    }
      
    
    @Test 
    public void test4()
    {
  assertEquals(false,a.shuffleCards(1));
    //System.out.println("4");
    }
    
    @Test 
    public void test5()
    {
  assertFalse(a.shuffleCards(-5));
   // System.out.println("5");
    }
     
   
 
    /**
     *Testcase for Turn
     */
    @Test
    public void test6()
    {
    assertFalse(a.turn(1));
         //System.out.println("6");
    }
    
   
    @Test
    public void test7()
    {
    assertEquals(false,a.turn(5));
      //System.out.println("7");   
    }  
   
    public void test8() 
    {a=new AnkhMorpork();
    assertTrue(a.next_turn(0));
      //System.out.println("8");
    }
    
     
    @Test
    public void test9() 
    {a=new AnkhMorpork();
    assertFalse(a.next_turn(-1));
    //System.out.println("9");
    }
     
    
    @Test
    public void test10() 
    {
    assertEquals(false,a.next_turn(4));
   // System.out.println("10");
    }
   /*
    *Testcase for assigning colors
    */
     @Test
      public void test12()
     {
     String[] pl={"red","blue","green","yellow"};
     try{ 
     boolean t= a.distribute(pl);
     System.out.println(t);
     }
     catch(NullPointerException ne)
     {
     System.out.println("returning null object");}
     }
      
       @Test
        public void test14()
     {
     String[] pl={"blue"};
    
    assertFalse(a.distribute(pl));
      
        }
        @Test
          public void test15()
     {
     String[] pl={"red","blue","green","yellow","orange"};
    
    assertEquals(false,a.distribute(pl));
      
      }
       /*
          *Testcase for cash payment
          */     
        
      @Test
        public void test16()
        {
        assertFalse(b.payment(-2));
        }
       
   
      

  
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}