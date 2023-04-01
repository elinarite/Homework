package TaskWorkParamEmp2;

import java.util.*;


public class Departemnt<T extends Employee> extends StringComparator{

    //    - СОТРУДНИКИ
//    Есть иерархия сотрудников
//    менеджеры, мидлы, джуны, сеньоры, тим лиды, CTO
//    написать класс который хранит только этот тип данных
//    Результат:класс<>-коллекция должен хранить только неповторяющихся
//    сотрудников в отсортированном виде
//    у класса должны быть методы RUD

    String name;
    List<T> department = new ArrayList<>();

    Set <T> hashSet = new HashSet<>();

    public void setHashSet(Set<T> hashSet) {
        this.hashSet = hashSet;
    }


    public Set<T> getHashSet() {
        return hashSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departemnt(String name) {
        this.name = name;
    }

    public List<T> getDepartment() {
        return department;
    }

    public void setDepartment(List<T> department) {
        this.department = department;
    }

    public void read() {
        for (T value : department) {
            System.out.println(value);
        }
    }

    public void add(T department) {
        getDepartment().add(department);
    }

    public void addRemove(T department, T department2) {
        getDepartment().add(department);
        getDepartment().remove(department2);
    }

    public void remove(T department) {
        getDepartment().remove(department);
    }

    @Override
    public String toString() {
        return name + department;
    }

    public void uniqui(){
        getHashSet().addAll(department);
        getDepartment().clear();
        getDepartment().addAll(getHashSet());
    }
}