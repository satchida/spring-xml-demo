package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void act(){
        System.out.println("Actor Name is "+this.name+"\nGender is "+this.gender+"\nAge is :"+this.age);
    }
}
