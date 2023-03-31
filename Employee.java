package TaskWorkParamEmp2;

import Prof_Work.comporable.String_Integer;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Employee implements Comparable<Employee> {

//    - СОТРУДНИКИ
//    Есть иерархия сотрудников
//    менеджеры, мидлы, джуны, сеньоры, тим лиды, CTO
//    написать класс который хранит только этот тип данных
//    Результат:класс<>-коллекция должен хранить только неповторяющихся
//    сотрудников в отсортированном виде
//    у класса должны быть методы RUD

    private String name;
    private int age;


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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    //@Override
    public int compareTo(Employee employee) {
        int nameOfcompare = employee.getName().compareTo(name);
        if (nameOfcompare == 0) {
            nameOfcompare = age - getAge();
        }
        return nameOfcompare;
    }
}

class Manager extends Employee {
    public Manager(String name, int age) {
        super(name, age);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Middle extends Employee {
    public Middle(String name, int age) {
        super(name, age);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Junior extends Employee {

    public Junior(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compareTo(Employee employee) {
        return super.compareTo(employee);
    }
}

class Senior extends Employee {
    public Senior(String name, int age) {
        super(name, age);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int compareTo(Employee employee) {
        return super.compareTo(employee);
    }
}

class TeamLead extends Employee {
    public TeamLead(String name, int age) {
        super(name, age);
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public int compareTo(Employee employee) {
        return super.compareTo(employee);
    }
}