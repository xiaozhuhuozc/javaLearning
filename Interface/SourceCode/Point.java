package com.example.myjavalib.Interface;

import java.util.Arrays;

public class Point implements MyComparable {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    @Override
    public int compareTo(Object other) {
        if(!(other instanceof Point)){
            throw new IllegalArgumentException();
        }
        Point otherPoint = (Point)other;
        double delta = distance() - ((Point) other).distance();
        if(delta < 0){
            return -1;
        }else if(delta > 0){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "("+x+y+")";
    }
    public static void main(String args[]){
        MyComparable p1 = new Point(1,2);
        MyComparable p2 = new Point(2,3);
        System.out.println(p1.compareTo(p2));

        Point[] points = new Point[]{
                new Point(2,3),
                new Point(3,4),
                new Point(1,2)
        };
        System.out.println("max: " + CompUtils.max(points));
        CompUtils.sort(points);
        System.out.println("sort: "+ Arrays.toString(points));
    }


}
