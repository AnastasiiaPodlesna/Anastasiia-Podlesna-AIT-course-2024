package classwork;

public class Mathmetod {

    public static void main(String[] args)
    {
        double euro = currency();
        System.out.println("Вы получаете " + euro + " Евро");

        double colorias = calculateCalorie();
        System.out.println("В вашем продукте " + colorias + " калорий");

    }

    private static double currency()
    {
        double Dollar = 150;
        return Dollar * 0.9;
    }

    private static double calculateCalorie()
    {
        double weight = 300;
        double colorage = 1150; // калорий на 100г
        return weight * colorage / 100;
    }






}