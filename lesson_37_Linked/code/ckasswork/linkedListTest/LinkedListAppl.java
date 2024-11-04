package ckasswork.linkedListTest;

// заполнить список случайными целыми числами
// проверить работу методов LinkedList

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListAppl
{
    private static final int N_NUMBER = 10;
    private static final Random random = new Random();
    private static final int MIN = 10;
    private static final int MAX = 20;

    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>(); //определяем имплементацию

        fillList(list); // создаем
        printList(list); // читаем

        System.out.println(list.size());
        System.out.println(list.get(0)); // первый элемент списка
        System.out.println(list.get(list.size()-1)); // последний элемент

        System.out.println(list.indexOf(10));// возвращает индекс "10" -ки
        list.set(0, 50);
        list.set(N_NUMBER -1, 100);
        printList(list);

        list.set(5, 200);
        printList(list);

        // удалить 15, если оно есть в списке

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            Integer num = iterator.next();
            if(num.equals(15))
            {
                iterator.remove(); // удаляет в позиции курсора итератора
            }
        }
        printList(list);

        list.remove(list.indexOf(100));
        printList(list);

        // удаление по условию (предикат, лямбда) все эл-ты, кратные 3

        list.removeIf(e -> e%3 == 0);
        printList(list);

    }

    private static void printList(List<Integer> list)
    {
        for (Integer i: list)
        {
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------------------------------");
    }

    private static void fillList(List<Integer> list)
    {
        for (int i = 0; i < N_NUMBER; i++)
        {
            list.add(random.nextInt(MIN, MAX));
        }
    }

}
