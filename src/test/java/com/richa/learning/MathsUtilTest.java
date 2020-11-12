package com.richa.learning;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@DisplayName("running maths util test")
public class MathsUtilTest {
MathsUtil mathsUtil;

@BeforeAll
  void topinit(){
    System.out.println("even before instance of class instance initialixation");
}
    @AfterAll
    static void topcleanup(){
        System.out.println("destroying class instance in the end");
    }

    @BeforeEach
     void init(){
         mathsUtil=new MathsUtil();
        System.out.println("initilazing mathsutil");

    }
    @AfterEach
    void cleanup(){
        System.out.println("cleanup");

    }

    @Nested
    @DisplayName("running add testing ")
  class AddTest{

    @Test
    @DisplayName("running test on add for +ve")
     void testAddPositive(){
        int actual= mathsUtil.add(1,2);
        int expected=3;
        assertEquals(expected,actual,()->"should return "+expected+" but returnning "+actual);
       }
    @Test
    @DisplayName("running test on add for -ve")
    void testAddNegative() {
        int actual = mathsUtil.add(-1, 2);
        int expected = 1;
        assertEquals(expected, actual);
     }

    }

    @RepeatedTest(7)
     void testsub(RepetitionInfo repetitionInfo){
    int i= repetitionInfo.getCurrentRepetition();
    int t=repetitionInfo.getTotalRepetitions();
        int actual= mathsUtil.sub(5,2);
        int expected=3;
        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("asssert all on multiply method")
     void testmul(){
        //int actual= mathsUtil.mul(5,2);
        //int expected=10;
        //assertEquals(expected,actual);
        assertAll(
                ()->assertEquals(2,mathsUtil.mul(1,2)),
                ()->assertEquals(0,mathsUtil.mul(1,0)),
                ()->assertEquals(10,mathsUtil.mul(5,2))

                );
    }
    @Test
    void testdiv(){
        assertThrows(ArithmeticException.class,()-> mathsUtil.div(2,0),"should throw arithmatic exception");
    }
    @Test
    @Disabled
    void testDisabled(){
    fail("this test should be disabled");
    }

}
