package com.richa.learning;
import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyTest {
    public static MathsUtil mathsUtil;
    private static Logger logger= LogManager.getLogger(MyTest.class);;
    @BeforeClass
    public static void setup(){
        logger.trace("setup done");
        mathsUtil=new MathsUtil();
    }
    @Test
    public void Testsum(){
        logger.info("testing sum");
        assertEquals(5,mathsUtil.add(2,3));
    }
    @Test
    public void TestDIV(){
        logger.info("testing DIVIDE");
            assertEquals(2,mathsUtil.div(6,3));
        }
    }

