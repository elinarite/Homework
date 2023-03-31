package TaskWorkParamEmp2;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Junior junior1 = new Junior("Anna", 1);
        Junior junior2 = new Junior("Anna", 1);
        Junior junior3 = new Junior("Ann", 3);
        Junior junior4 = new Junior("Ann", 4);
        Junior junior5 = new Junior("Anna", 5);
        Junior junior6 = new Junior("Anna", 6);


        Departemnt<Junior> juniorDepartemnt = new Departemnt<>("Junior");

        juniorDepartemnt.add(junior1);
        juniorDepartemnt.add(junior2);
        juniorDepartemnt.add(junior3);
        juniorDepartemnt.add(junior4);
        juniorDepartemnt.add(junior5);
        juniorDepartemnt.uniqui();

        System.out.println(juniorDepartemnt);
        juniorDepartemnt.remove(junior3);
        System.out.println(juniorDepartemnt);
        juniorDepartemnt.read();
        juniorDepartemnt.addRemove(junior6, junior5);
        System.out.println(juniorDepartemnt);


    }
}
