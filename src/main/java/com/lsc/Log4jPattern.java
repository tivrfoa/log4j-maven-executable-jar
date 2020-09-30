package com.lsc;
 
import org.apache.log4j.Logger;
 
public class Log4jPattern {
 
    static Logger logger = Logger.getLogger(Log4jPattern.class);
 
    public static void main(String[] args) {
 
        logger.info("This Is A Log Message ..!");
    }
}
