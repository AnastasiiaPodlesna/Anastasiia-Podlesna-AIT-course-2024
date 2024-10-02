package homework;

import java.util.Scanner;

public class CarAtTrafficLight
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the color (or color number) of the traffic light: ");
        System.out.println("1 - red;");
        System.out.println("2 - yellow;");
        System.out.println("3 - green;");
        String ColorLight  = in.next();

        switch(ColorLight)
        {
            case "red" ->
            {
                System.out.println("Stop !!!");
            }
            case "1" ->
            {
                System.out.println("Stop !!!");
            }
            case "yellow" ->
            {
                System.out.println("Attention !!");
            }
            case "2" ->
            {
                System.out.println("Attention !!");
            }
            case "green" ->
            {
                System.out.println("Drive ! Follow the rules of the road !");
            }
            case "3" ->
            {
                System.out.println("Drive ! Follow the rules of the road !");
            }
            default ->
            {
                System.out.println("Input incorrect...");
            }
        }
    }
}

