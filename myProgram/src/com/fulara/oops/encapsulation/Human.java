package com.fulara.oops.encapsulation;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Human h = new Human();
        h.setName("Gaurav");
        h.setAge(22);
        System.out.println(h.getAge()+" : "+h.getName());
    }
}
