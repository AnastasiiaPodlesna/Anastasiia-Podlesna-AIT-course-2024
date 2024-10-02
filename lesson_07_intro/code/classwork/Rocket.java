package classwork;

//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket
{
    public static void main(String[] args)
    {
        int count = 10;

        while (count > 0)
        {
         count --;
         System.out.println(" We have " + count + " till start");
        }

        System.out.println("Here we go!");
    }
}
