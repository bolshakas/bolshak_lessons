package com.bolshak.lessons.lesson6;

public class Cat extends Animal {

    private  String bread;

    public Cat() {
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public Cat(String name, int spreed, int age, String bread) {
        super(name, spreed, age);
        this.bread = bread;
    }

    public void print () {
        System.out.println("Name " + getName() + " age " + getAge() + " spread " + getSpreed() + getBread());
    }
}
