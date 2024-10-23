package homework.Friend_sorting;

import java.util.Objects;

public class Friend implements Comparable<Friend>
{
    private String name;
    private int age;
    private double friendshipTime;

    public Friend(String name,
            int age,
            double friendshipTime)
    {
        this.name = name;
        this.age = age;
        this.friendshipTime = friendshipTime;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getFriendshipTime()
    {
        return friendshipTime;
    }

    public void setFriendshipTime(double friendshipTime)
    {
        this.friendshipTime = friendshipTime;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Friend friend)) return false;
        return age == friend.age && Double.compare(friendshipTime, friend.friendshipTime) == 0 && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age, friendshipTime);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("homework_Friend_sorting.Friend{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", friendshipTime=").append(friendshipTime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Friend o) // по умолчанию строим подруг по сроку дружбы :)
    {
        return -Double.compare(this.getFriendshipTime(), o.getFriendshipTime());
    }


    public void printArray(Object[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

}
