package homework_Frieds.test;

import homework_Frieds.Friend;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class FriendTest
{
    Friend[] friends;
    Friend friend;

    @BeforeEach
    public void setUp()
    {
        friend = new Friend(null, 0);

        friends = new Friend[4];

        friends[0] =  new Friend("Nika", 15);
        friends[1] =  new Friend("Lilya", 10);
        friends[2] =  new Friend("Omina", 5);
        friends[3] =  new Friend("Lena", 20);
    }

    //сортировка по умолчанию (по сроку дружбы)
    @Test
    public void testByFriendshipTime()
    {
        friend.printArray(friends,  " Print as is ");
        Arrays.sort(friends);
        friend.printArray(friends, " Print after native sorting ");
    }

    // есть ли в списке подруг, те с кем дружба 13 лет?
    @Test
    public void testByFriendshipTime13Years() {
        Arrays.sort(friends);
        //friend.printArray(friends, " Print after native sorting ");
        Friend friendshipTime13Years = new Friend(null, 13);
        int index = Arrays.binarySearch(friends, friendshipTime13Years);
        int newIndex = index >= 0 ? index : (-index - 1);

        if (index < 0) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Record with field '" + friendshipTime13Years.getFriendshipTime() + "' not found, but has an index => " + newIndex);
        } else
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Record with field '" + friendshipTime13Years.getFriendshipTime() + "' found by index =>  " + newIndex);
        }
    }

    //Отсортируйте список по алфавиту.
    //Есть ли в списке подружка по имени Frosya? Какой она имеет номер в списке?
    @Test
    public void testByFriendName()
    {
        friend.printArray(friends, " List as is ");
        Friend friendName = new Friend("Frosya", 0);

        Arrays.sort(friends, (f1, f2) -> f1.getName().compareTo(f2.getName()));// сортировка по алфавиту

        int index = Arrays.binarySearch(friends, friendName); // ищем подружку Фросю
        int newIndex = index >= 0 ? index : (-index - 1);

        if (index < 0)
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Record with field '" + friendName.getName() + "' not found, but has an index => " + newIndex);
        } else
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Record with field '" + friendName.getName() + "' found by index =>  " + newIndex);
        }
    }

    // Скопируйте массив в другой, имеющий в 2 раза большую длину.
    // Отсортируйте полученный массив.
    @Test
    public void testByLongArrayFriends()
    {
        Friend[] longArrayFriends = Arrays.copyOf(friends, friends.length * 2);

        Comparator<Friend> comparatorByName = Comparator.nullsLast((f1, f2) -> f1.getName().compareTo(f2.getName())); // сравнение по алфавиту, нули в конец

        Arrays.sort(longArrayFriends, comparatorByName); // отсортировали по алфавиту, нули в конце
        friend.printArray(longArrayFriends, " New array ");
    }

    // Вставьте новую подругу Риту в список, сохранив порядок сортировки по сроку дружбы.
    @Test
    public void testByNewFriendInsert()
    {
        Arrays.sort(friends);

        // расширяем массив на 1 объект
        Friend[] longArrayFriends = Arrays.copyOf(friends, friends.length + 1);

        Comparator<Friend> comparatorByFriendshipTime = Comparator.nullsLast((f1, f2) -> Double.compare(f1.getFriendshipTime(), f2.getFriendshipTime())); // сравнение по cроку дружбы, нули в конец

        Friend newFriend = new Friend("Rita", 1);
        int index = Arrays.binarySearch(longArrayFriends,0, longArrayFriends.length - 1, newFriend);
        index = index >= 0 ? index : (-index -1);

        System.arraycopy(longArrayFriends, index, longArrayFriends, index + 1, longArrayFriends.length - index - 1);

        longArrayFriends[index] = newFriend;
        friends = longArrayFriends;
        friend.printArray(friends, " Print list with new friend ");
    }
}