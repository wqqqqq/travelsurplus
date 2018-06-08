package com.wq.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringPicker {

    public static String getDate(String soap){
        String rgex = "[0-9]{0,4}[/]{0,1}[0-9]{1,2}[/][0-9]{1,2}";
        return getSubString(soap, rgex);
    }

    public static String getSubString(String soap, String rgex){
        Pattern pattern = Pattern.compile(rgex);
        Matcher m = pattern.matcher(soap);
        while(m.find()){
            return m.group(0);
        }
        return "";
    }
}
