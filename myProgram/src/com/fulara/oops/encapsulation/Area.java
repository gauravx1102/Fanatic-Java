package com.fulara.oops.encapsulation;

import com.fulara.oops.inheritance.single.A;

public class Area {
    private int l;
    private int w;
    private int h;
    Area(int l, int w) {
        this.l = l;
        this.w = w;
    }
//    Area(int l, int w) {
//        this.l = l;
//        this.w = w;
//    }
    Area(int l, int w,int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public void getArea(){
        int area = l * w ;
        System.out.println("area is : "+area );
    }
//    public void getArea(){
//        int area = l * w * h;
//        System.out.println("area is : "+area );
//    }

    public static void main(String[] args) {
        Area a = new Area(12,23,21);
        a.getArea();
    }
}
