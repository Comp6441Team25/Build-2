/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ankh.morpork.AnkhMorpork;
import first_page.Bank;
import first_page.Symbols;
import static java.lang.Boolean.FALSE;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class DiscworldTest {
    
    AnkhMorpork a=new AnkhMorpork();
    Bank b=new Bank();
    Symbols s=new Symbols();
    /**
     *
     */
    
    
    /**
     *Testcase for shuffle cards
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
     *Testcase for turns
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
   /**
    * Testcase for color distribution
    */
     @Test
      public void test12()
     {
     String[] pl={"red","blue","green","yellow"};
     try{ 
     assertEquals(true, a.distribute(pl));
     
     }
     catch(NullPointerException ne)
     {
     System.out.println("returning null object");}
     }
      @Test
       public void test13()
     {
         try{
     String[] pl={"red","blue","green"};
         
    assertTrue(a.distribute(pl));
         }
         catch(NullPointerException ne)
         {
             System.out.println("returning null object");
         }
          
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
        /**
         * Testcase for payment
         */   
       
        @Test 
        public void test16()
        {
            assertFalse(b.payment(-13));
        }
        /**
         * Testcase for fund
         */
        @Test
        public void test17()
        {
            assertFalse(b.fund(-1));
        }
        @Test
        public void test18()
        {
            boolean t=b.fund(-13);
            assertEquals(false,t);
        }    
                  
         @Test 
    public void test19()
    { 
  assertEquals(false,a.shuffleCards(0));
    //System.out.println("3");
    }
    @Test
    public void test20()
    {
    assertFalse(a.turn(6));
         //System.out.println("6");
    }
    @Test
    public void test21() 
    {
    assertEquals(false,a.next_turn(5));
   // System.out.println("10");
    }
      @Test 
        public void test22()
        {
            assertFalse(b.payment(-15));
        }
     
      
      
        
        
         
        
        
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
