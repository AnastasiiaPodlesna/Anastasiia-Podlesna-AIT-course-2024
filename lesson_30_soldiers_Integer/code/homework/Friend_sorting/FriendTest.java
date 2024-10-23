package homework.Friend_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class FriendTest
{

    Friend[] friends;
    Friend friend;

    @BeforeEach
    void setUp()
    {
        friend = new Friend(null, 0, 0);
        friends = new Friend[]
        {
        new Friend("F1", 32, 10),
        new Friend("F2", 40, 15),
        new Friend("F1", 30, 5),
        new Friend("F4", 25, 10)
        };
    }

    //сортировка по умолчанию
    @Test
    void testByFriendshipTime()
    {
        System.out.println("----------------- Print as is ------------------------");
        friend.printArray(friends);
        Arrays.sort(friends);
        System.out.println("------------ Print after native sorting --------------");
        friend.printArray(friends);
    }

    //сортировка по 2-м критериям
    @Test
    void testByNameAndAge()
    {
        Comparator<Friend> comparatorByNameAndAge = new Comparator<Friend>()
        {
            @Override
            public int compare(Friend o1, Friend o2)
            {
                int name = o1.getName().compareTo(o2.getName());
                return name != 0 ? name: Integer.compare(o1.getAge(), o2.getAge()) ;
            }
        };

        System.out.println("----------------- Print as is ------------------------");
        friend.printArray(friends);
        Arrays.sort(friends, comparatorByNameAndAge);
        System.out.println("------------ Print after native sorting --------------");
        friend.printArray(friends);
    }

    //поиск в массиве с помощью Arrays.binarySearch()
    @Test
    void testBinarySearch()
    {
        System.out.println("----------------- Print as is ------------------------");
        Arrays.sort(friends);

        friend.printArray(friends);
        Friend pattern = new Friend(null, 0, 5);
        int index = Arrays.binarySearch(friends, pattern, Friend::compareTo);
        System.out.println("------------- Print binary search result ----------------");
        System.out.println(" Index = " + index);

    }


}