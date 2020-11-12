package com.richa.learning;


//import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MathsUtil {
 private Logger logger= LogManager.getLogger(MathsUtil.class);
        public int add(int a, int b){
            logger.info("value of a:"+a);
            logger.info("value of b: +b");
            return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
            if(b==0)
            {
                logger.warn("b cant tbe 0");
            }
        try {
            int r = a / b;
        }catch(ArithmeticException e){}
            return a/b;
    }
}
