package com.lry.generate.code.demo;

/**
 * Created by qinqin on 2019/3/15.
 */
public class MyDemoTest {
    public static void main(String[] args) {

        String str = "V1.0001.0002.R";

        String str1 = "V1.0001.0002.11.R";

        char[] strs = str1.toCharArray();

        int num = 0;
        for (char s : strs) {
            num += s;
        }

        System.out.println(num);
    }
}
