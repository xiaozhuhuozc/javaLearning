package com.example.myjavalib.innerclass;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-22 23:31
 */
public class StaticInnerClassTest {
     public static int shared = 100;
     private int max = 200;
     public static class StaticInner{
         public void innerMethod(){
             // System.out.println("inner = "+max); 无法访问成员变量
             // print(); 无法访问成员方法
             System.out.println("inner "+shared);
         }
     }
    public void print(){
        System.out.println("inner "+shared);
    }

     public void test(){
         StaticInner si = new StaticInner();
         si.innerMethod();
    }
    public static void main(String args[]){
         StaticInnerClassTest.StaticInner si = new StaticInnerClassTest.StaticInner();
         si.innerMethod();
    }
}
