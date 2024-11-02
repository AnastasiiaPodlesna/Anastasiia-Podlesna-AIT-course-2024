package classwork.ilist;


import care_garage.ait.cars.model.Car;
import classwork.ilist.model.IList;
import classwork.ilist.model.IListImpl;

import java.util.ArrayList;
import java.util.List;

public class IListAppl {

    public static void main(String[] args) {

        // список с целыми числами
        IList<Integer> listOfAge = new IListImpl<>();

        listOfAge.add(61);
        listOfAge.add(38);
        listOfAge.add(37);
        listOfAge.add(35);
        listOfAge.add(44);
        listOfAge.add(27);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(37);
        listOfAge.add(46);
        listOfAge.add(23);
        listOfAge.add(45);
        listOfAge.add(18);
        listOfAge.add(63);

        System.out.println(listOfAge.size());
        System.out.println(listOfAge.indexOf(61)); // 0
        System.out.println(listOfAge.indexOf(63)); // 13
        System.out.println(listOfAge.indexOf(37)); // 6

        System.out.println(listOfAge);
        int index = 0;

        for (Integer i : listOfAge) {
            System.out.println(index++ + " : " + i);
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 0; i < listOfAge.size(); i++) {
            if(listOfAge.get(i) == 37){
                System.out.println(i + " : 37");
            }
        }

        int sum = 0;
        for (Integer i : listOfAge ) {
            sum += i;
        }
        System.out.println("--------------------------------");
        System.out.println(sum);
        double avgAge = (double) sum / listOfAge.size();
        System.out.println(avgAge);

        //
        System.out.println("--------------------------------");
        IList<String> listOfNames = new IListImpl<>();
        listOfNames.add("Leonid");
        System.out.println(listOfNames.size());
        listOfNames.add("Artem");
        listOfNames.add("Diana");
        listOfNames.add("Dmitri");
        listOfNames.add("Juri");
        listOfNames.add("Carina");
        listOfNames.add("Dmitri");
        listOfNames.add(null);
        listOfNames.add("German");
        System.out.println(listOfNames.size());

        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ + " : " + str);
        }

        String strTotal = "";
        for (String str : listOfNames) {
            strTotal += str;
        }
        System.out.println(strTotal);

        listOfNames.remove(3);
        listOfNames.remove("Leonid");

        index = 0;
        for (String str : listOfNames) {
            System.out.println(index++ + " : " + str);
        }


        List<Car> listCars = new ArrayList<>();

    }

}