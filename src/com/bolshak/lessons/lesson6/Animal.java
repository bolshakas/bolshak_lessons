package com.bolshak.lessons.lesson6;

public abstract class Animal {
    private  String name;
    private int spreed;
    private  int age;

    public Animal() {

    }

    public Animal(String name, int spreed, int age) {
        this.name = name;
        this.spreed = spreed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpreed() {
        return spreed;
    }

    public void setSpreed(int spreed) {
        this.spreed = spreed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print (){
        System.out.println("Name " + name+ " age " + this.getAge() + " spread " + this.getSpreed());
    }






}
