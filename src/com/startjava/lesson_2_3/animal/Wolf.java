package com.startjava.lesson_2_3.animal;

public class Wolf {
    private int age;
    private String color;
    private boolean male;
    private String nickname;
    private double weight;

    public static final int MAX_AGE = 8;

    public int getAge() {
         return age;
    }

    public void setAge(int age) {
        if (age > MAX_AGE) {
            System.out.println("Некорректный возраст!");
            return;
        }
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void walk() {
        System.out.println("Идет");
    }
}