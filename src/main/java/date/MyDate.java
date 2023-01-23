package date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    static Logger logger = LoggerFactory.getLogger(MyDate.class);

    public static void main(String[] args) {
        logger.info("This is an info message");
        logger.error("This is an error message");

        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("MM/dd/yyyy");
        String stringDate = DateFor.format(date);
        logger.info("Date Format with MM/dd/yyyy : " + stringDate);
        DateFor = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        stringDate = DateFor.format(date);
        logger.info("Date Format with dd-M-yyyy hh:mm:ss : " + stringDate);
        DateFor = new SimpleDateFormat("dd MMMM yyyy");
        stringDate = DateFor.format(date);
        logger.warn("\"\\u001B[33m\"+\"Date Format with dd MMMM yyyy : " + stringDate);
        DateFor = new SimpleDateFormat("dd MMMM yyyy zzzz");
        stringDate = DateFor.format(date);
        logger.info("Date Format with dd MMMM yyyy zzzz : " + stringDate);
        DateFor = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        stringDate = DateFor.format(date);
        logger.info("Date Format with E,dd MMM yyyy HH:mm:ss z :" + stringDate);
    }
}


