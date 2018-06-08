package com.wq.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {

    public static Date str2Date(String dateStr){
        DateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = format1.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static boolean compareDateStr(String ds1, String ds2){
        return str2Date(ds1).equals(str2Date(ds2));
    }
}
