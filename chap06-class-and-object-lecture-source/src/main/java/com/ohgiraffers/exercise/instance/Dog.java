package com.ohgiraffers.exercise.instance;

public class Dog {

    private String name;
    private int age;
    private String breed;

    public void dogName(String name) {
        this.name = name;
    }

    public void dogAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }

    public void dogBreed(String breed) {
        this.breed = breed;
    }

    public String getDogInfo() {
        return "이 강아지의 이름은 '" + name + "'이고 나이는 " + age + "살이며 " + breed + "입니다.";
    }

}
