package com.example.myjavalib.innerclass;

import java.util.Arrays;
import java.util.Comparator;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-23 22:48
 */
public class AnonymousInnerClass {
    public void sortIgnoreCase(String[] strs){
        Arrays.sort(strs, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
    public static void main(String[] args){
        String [] strArr = new String[]{"red" ,"yellow","blue"};
        AnonymousInnerClass aic = new AnonymousInnerClass();
        aic.sortIgnoreCase(strArr);
        for(int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }

    }
}
