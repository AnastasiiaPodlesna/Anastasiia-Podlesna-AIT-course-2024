package homework_Frieds;

import homework_Frieds.test.FriendTest;

public class FriendAppl
{
    public static void main(String[] args)
    {
        System.out.println("\n---------------- Dedicated to All Friends ----------------");
        FriendTest friendTest = new FriendTest();
        friendTest.setUp(); // Инициализация

        friendTest.testByFriendshipTime();
        friendTest.testByFriendshipTime13Years();
        friendTest.testByFriendName();
        friendTest.testByLongArrayFriends();
        friendTest.testByNewFriendInsert();

    }
}
