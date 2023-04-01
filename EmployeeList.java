package TaskWorkParamEmp2;

import java.util.*;


public class EmployeeList <T extends Employee>{

    //    - СОТРУДНИКИ
//    Есть иерархия сотрудников
//    менеджеры, мидлы, джуны, сеньоры, тим лиды, CTO
//    написать класс который хранит только этот тип данных
//    Результат:класс<>-коллекция должен хранить только неповторяющихся
//    сотрудников в отсортированном виде
//    у класса должны быть методы RUD

    private String nameOfPosition;
    Set<T> employeeList = new TreeSet<>();


    public String getNameOfPosition() {

        return nameOfPosition;
    }

    public void setNameOfPosition(String nameOfPosition) {
        this.nameOfPosition = nameOfPosition;
    }

    public EmployeeList(String name) {
        this.nameOfPosition = name;
    }

    public Set<T> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<T> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * displays a list of employees
     */
    public void print() {
        for (T employee : employeeList) {
            System.out.println(employee);
        }
    }

    /**
     * adds an employee to the list
     */
    public void add(T employee) {
        employeeList.add(employee);
    }

    /**
     *removes an employee from the list
     */
    public void remove(T employee) {
        employeeList.remove(employee);
    }

    /**
     * change employee name to new name
     * @param employee employee whose name needs to be changed
     * @param newEmployeeName name to replace
     */
    public void updateEmployeeName(T employee, String newEmployeeName){
        for(T value : employeeList){
            if(value.equals(employee)){
                employee.setName(newEmployeeName);
            }
        }
    }

    /**
     * change employee age
     * @param employee  employee whose age needs to be changed
     * @param newEmployeeAge age to replace
     */

    public void updateEmployeeAge(T employee, int newEmployeeAge){
        for(T value : employeeList){
            if(value.equals(employee)){
                employee.setAge(newEmployeeAge);
            }
        }
    }
    @Override
    public String toString() {
        return nameOfPosition + employeeList;
    }
}