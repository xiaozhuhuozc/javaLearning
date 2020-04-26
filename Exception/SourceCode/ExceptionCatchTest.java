package com.example.myjavalib.exception;

/*
 *Description:
 *Autour: Administrator
 *Date: 2020-04-26 22:38
 */
public class ExceptionCatchTest {
    public static void main(String args[]){
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("not valid number");
            //throw new AppException("输入格式不正确", e); 自定义类型
        }catch(RuntimeException e){
            System.out.println("runtime exception "+e.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
