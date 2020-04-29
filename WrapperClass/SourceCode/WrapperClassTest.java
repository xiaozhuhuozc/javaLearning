package com.example.myjavalib.wrapperclass;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-27 22:35
 */
public class WrapperClassTest {
    public static void main(String args[]){
        int i1 = 12345;
        //11 000000 111001
        Integer iObj = Integer.valueOf(i1);
        int i2 = iObj.intValue();
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.reverse(i1));

        Integer e1 = new Integer(16);
        Integer e2 = new Integer(16);
        System.out.println(e1 == e2);

        Integer f1 = Integer.valueOf(16);
        Integer f2 = Integer.valueOf(16);
        System.out.println(f1 == f2);
    }
}
