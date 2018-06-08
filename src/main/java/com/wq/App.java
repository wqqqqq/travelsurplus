package com.wq;

import com.wq.Utils.DateFormatUtil;
import com.wq.Utils.SubStringPicker;

public class App
{
    public static void main( String[] args )
    {
        String str = SubStringPicker.getDate("/t/n/t08/12[四]");
        String str1 = SubStringPicker.getDate("2018/8/12");
        System.out.println(str + "---" + str1);

        System.out.println(DateFormatUtil.compareDateStr("2018/" + str, str1));

    }
}
