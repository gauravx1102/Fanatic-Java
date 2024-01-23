package com.fulara.oops.constructor.constructorOverloading;
    public class c01 {
        double days;
        double attendDays;
        double notAttend;
        c01(double days,double attendDays,double notAttend ){
            this.days = days;
            this.attendDays = attendDays;
            this.notAttend = notAttend;
        }
        void display1(){
            double percnett = (attendDays/days)* 100;
            System.out.println("School opend for "+days+" days. You attend "+attendDays+" Days. And you're overall leave for this month is "+notAttend);
            System.out.format("you're overall percentage is %.02f ",percnett);
        }

        public static void main(String[] args) {

            c01 ai = new c01(30, 10,20);

            ai.display1();
        }

    }