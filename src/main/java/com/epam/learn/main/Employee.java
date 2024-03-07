package com.epam.learn.main;

public class Employee {
    String name;
    int age;
    static int i;

    {
        i = 5;
    }

    int a;

//    static {
//        a = 5;
//    }

    public Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}

class main {
    public static void main(String[] args) {
//        Employee e =  new Employee("Alex", 30);
//        System.out.println(e.name);
    }
}