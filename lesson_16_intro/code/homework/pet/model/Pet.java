package homework.pet.model;

import java.util.Random;

public class Pet
{
    private int id;
    private String type;
    private int age;
    private String name;

    public Pet(int id, String type, int age, String name)
    {
        this.id = id;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getType()
    {
        return type;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    //-----------------------------------------------------------
    public static void sleep()
    {
        System.out.println("Sleep...");
    }
    public static void eat()
    {
        System.out.println("Eat...");
    }
    public static void make_a_sound()
    {
        System.out.println("Make a sound...");
    }
    public static void play()
    {
        System.out.println("Play...");
    }
    public static void walk()
    {
        System.out.println("Walk...");
    }

    public static void petDays()
    {
        Random random = new Random();
        homework.pets.model.Pet[] pets = new homework.pets.model.Pet[10];
        int func = random.nextInt(5);

        switch (func)
        {
            case 0 ->
            {
                System.out.println("the animal is not well, urgently contact a veterinarian !");
            }
            case 1 ->
            {
                sleep();
            }
            case 2 ->
            {
                sleep();
                eat();
            }
            case 3 ->
            {
                sleep();
                eat();
                make_a_sound();
            }
            case 4 ->
            {
                sleep();
                eat();
                make_a_sound();
                play();
            }
            case 5 ->
            {
                sleep();
                eat();
                make_a_sound();
                play();
                walk();
            }

        }

    }

}
