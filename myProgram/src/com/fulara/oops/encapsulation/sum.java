package com.fulara.oops.encapsulation;

public class sum {
    private int n1;
    private int n2;


    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }


    public static void main(String[] args) {
        sum s = new sum();
        s.setN1(20);
        s.setN2(30);
        int res = s.getN1() + s.getN2();
        System.out.println(res);
    }
}
