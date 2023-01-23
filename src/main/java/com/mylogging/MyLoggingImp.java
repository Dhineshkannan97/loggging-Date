package com.mylogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyLoggingImp {

    private static final Logger logger = LoggerFactory.getLogger(MyLoggingImp.class);

    public static void getLog(){
//        MDC.put("user","dhiinesh");
        String log4jConfPath = "C:\\Users\\Dhinesh Kannan\\Documents\\Streams\\loggging\\src\\main\\resources\\log4j.properties";
        //PropertyConfigurator.configure(log4jConfPath);
        logger.info("This is my log");
        int numOfProb= 9;
        logger.info("we got :{}");
        logger.warn("this is warning log");
    }

    public static void main(String[] args) {
        getLog();
    }
}
