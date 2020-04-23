package com.example.myjavalib.innerclass;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-23 22:28
 */
public class MemberInnerClassTest {
    private int a = 100;
    private static void print(){
        System.out.println("out print func");
    }
    public void test(final int param){
        final String str = "hello";
        final int a = 200;
        class Inner{
            public void innerMethod(){
                print();
                System.out.println("Outer a = "+a);
                System.out.println("param = "+param);
                System.out.println("local var = "+str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
    public static void main(String args[]){
        MemberInnerClassTest mict = new MemberInnerClassTest();
        mict.test(20);
    }
}
