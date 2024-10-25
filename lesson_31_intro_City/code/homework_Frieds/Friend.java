package homework_Frieds;

import java.util.Objects;

public class Friend implements Comparable<Friend>
{
    private String name;
    private double friendshipTime;

    public Friend(String name, double friendshipTime)
    {
        this.name = name;
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
        return Double.compare(friendshipTime, friend.friendshipTime) == 0 && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friendshipTime);
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s, friendship time: %.2f", name, friendshipTime);
    }

    @Override
    public int compareTo(Friend o) // по умолчанию строим подруг по сроку дружбы :)
    {
        return Double.compare(this.getFriendshipTime(), o.getFriendshipTime());
    }

    public void printArray(Object[] array, String titleOfReport)
    {
        System.out.println("\n------------" + titleOfReport + "---------------");
        for (Object o : array)
        {
            System.out.println(o);
        }
    }

}