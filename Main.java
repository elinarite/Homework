package TaskWorkParamEmp2;

public class Main {


    public static void main(String[] args) {
        Junior junior1 = new Junior("Anna", 1);
        Junior junior2 = new Junior("Anna", 1);
        Junior junior3 = new Junior("Ann", 3);
        Junior junior4 = new Junior("Ann", 3);
        Junior junior5 = new Junior("Anna", 5);
        Junior junior6 = new Junior("Anna", 6);

        EmployeeList<Employee> employeeList = new EmployeeList<>();

        employeeList.add(junior1);
        employeeList.add(junior2);
        employeeList.add(junior3);
        employeeList.add(junior4);
        employeeList.add(junior5);
        System.out.println(employeeList);
        employeeList.remove(junior3);
        System.out.println(employeeList);
        employeeList.print();

        employeeList.updateEmployeeName(junior1,"peter");
        System.out.println(employeeList);
        employeeList.updateEmployeeAge(junior1,4);
        System.out.println(employeeList);
        employeeList.searchByName("peter");

    }
}
