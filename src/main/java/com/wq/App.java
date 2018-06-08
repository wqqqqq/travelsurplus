package com.wq;

import com.wq.Utils.SubStringPicker;

public class App
{
    public static void main( String[] args )
    {
        String str = SubStringPicker.getDate("/t/n/t08/30[四]");
        String str1 = SubStringPicker.getDate("2018/08/12");
        System.out.println(str + "---" + str1);


    }
}
