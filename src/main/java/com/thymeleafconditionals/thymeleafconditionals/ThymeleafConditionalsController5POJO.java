package com.thymeleafconditionals.thymeleafconditionals;

public class ThymeleafConditionalsController5POJO {
    private String name;
    private int age;
    private String role;

    public ThymeleafConditionalsController5POJO(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public ThymeleafConditionalsController5POJO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
