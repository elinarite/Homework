package TaskWorkParamEmp2;

import java.util.Objects;


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
        if (!(o instanceof Employee)) return false;
        return age == ((Employee) o).getAge() && Objects.equals(name, ((Employee) o).getName());
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
        if (this.name.compareTo(employee.getName()) == 0) {
           return this.age - employee.getAge();
        }
        return this.name.compareTo(employee.getName());
    }
}