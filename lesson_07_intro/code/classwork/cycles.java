package classwork;

// Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор,
// пока они там есть. Последнее сообщение: "Яблоки кончились!".

public class cycles
{
    public static void main(String[] args)
    {
        int apples = 30;

        while (apples > 0)
        {
            System.out.println("В корзине " + apples + " яблок");
            apples = apples - 1;
            System.out.println("бери еще");
        }
        System.out.println("В корзине нет яблок");
        System.out.println("Яблоки кончились!");

    }
}
