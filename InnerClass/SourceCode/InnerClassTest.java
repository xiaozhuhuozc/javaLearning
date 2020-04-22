package com.example.myjavalib.innerclass;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-23 00:00
 */
public class InnerClassTest {
    private int a = 100;

    public class Inner {
        public void innerMethod(){
            System.out.println("outer a " +a);
            InnerClassTest.this.action();
            action01();
        }
    }

    private void action(){
        System.out.println("action");
    }

    private void action01(){
        System.out.println("action01");
    }

    public void test(){
        Inner inner = new Inner();
        inner.innerMethod();
    }
    public static void main(String args[]){
        InnerClassTest ict = new InnerClassTest();
        InnerClassTest.Inner inner = ict.new Inner();
        inner.innerMethod();

        InnerClassTest.Inner in = new InnerClassTest().new Inner();
        in.innerMethod();
    }
}
