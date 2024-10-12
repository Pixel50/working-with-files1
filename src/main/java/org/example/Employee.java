package org.example;

public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    // Пустой конструктор
    public Employee() {
    }

    // Конструктор с параметрами
    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
}
