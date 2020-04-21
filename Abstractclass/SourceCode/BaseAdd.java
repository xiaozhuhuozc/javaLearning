package com.example.myjavalib.abstractclass;

public class BaseAdd extends AbstractAdder {

    public static final int MAX_NUM = 10;
    public  int[] arr = new int[MAX_NUM];
    private int count;
    @Override
    public void add(int number) {
        if(count<MAX_NUM){
            arr[count++] = number;
        }

    }

    public static void main(String args[]){
        BaseAdd ba = new BaseAdd();
        ba.addAll(new int[]{11,12,13});
        for(int i=0;i<ba.arr.length;i++) {
            System.out.println(ba.arr[i] + "");
        }
    }
}
