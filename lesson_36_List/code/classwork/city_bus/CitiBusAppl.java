package classwork.city_bus;

import java.util.*;

public class CitiBusAppl
{
    public static void main(String[] args)
    {


        List<Bus> cityBusList = new ArrayList<>();

        cityBusList.add(new Bus("MAN", "num1", "3", 35));
        cityBusList.add(new Bus("Scania", "num2", "10A", 40));
        cityBusList.add(new Bus("MAN", "num3", "10C", 25));
        cityBusList.add(new Bus("Mercedes", "num4", "1A", 35));
        cityBusList.add(new Bus("Volvo", "num5", "100", 45));

        for (Bus bus : cityBusList)
        {
            System.out.println(bus);
        }

        System.out.println("--------------------------------------------------------------");

        cityBusList.sort(Bus::compareTo);
        for (Bus bus : cityBusList)
        {
            System.out.println(bus);
        }

        Comparator<Bus> comparator = new Comparator<Bus>() {
            @Override
            public int compare(Bus o1, Bus o2)
            {
                int res = o1.getRoute().compareTo(o2.getRoute()) ;
                return res !=0 ? res : - Integer.compare(o1.getBusCapacity(), o2.getBusCapacity());
            }
        };

        cityBusList.sort(comparator);
        System.out.println("-----------------------------------------");
        for (Bus bus : cityBusList)
        {
            System.out.println(bus);
        }



    }
}
