package TaskWorkParamEmp2;

public class Main {


    public static void main(String[] args) {
        Junior junior1 = new Junior("Anna", 1);
        Junior junior2 = new Junior("Anna", 1);
        Junior junior3 = new Junior("Ann", 3);
        Junior junior4 = new Junior("Ann", 4);
        Junior junior5 = new Junior("Anna", 5);
        Junior junior6 = new Junior("Anna", 6);



        EmployeeList<Junior> juniorList = new EmployeeList<>("Junior");

        juniorList.add(junior1);
        juniorList.add(junior2);
        juniorList.add(junior3);
        juniorList.add(junior4);
        juniorList.add(junior5);
        System.out.println(juniorList);
        juniorList.remove(junior3);
        System.out.println(juniorList);
        juniorList.print();

        juniorList.updateEmployeeName(junior1,"peter");
        System.out.println(juniorList);

    }
}
