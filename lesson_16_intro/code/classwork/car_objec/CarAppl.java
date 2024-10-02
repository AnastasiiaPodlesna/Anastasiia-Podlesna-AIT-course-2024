package classwork.car_objec;

import classwork.car_objec.model.Car;

public class CarAppl
{
    public static void main(String[] args)
    {
        Car myCar = new Car("VW", 2014, 15000, "rad", false); // create object

        System.out.println(myCar.toString()); // или sout(myCar);

        myCar.move();
        myCar.stop();
    }
}
