package com.epam.jwd.entity;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private int salary;
    Job job;

    public Employee(String name, String surname, int age, int salary, Job job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age
                && salary == employee.salary
                && name.equals(employee.name)
                && surname.equals(employee.surname)
                && job.equals(employee.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary, job);
    }

    @Override
    public String toString() {
        return "\nname= " + name +
                ", surname= " + surname +
                ", age= " + age +
                ", salary=" + salary +
                ", job=" + job;
    }
}
