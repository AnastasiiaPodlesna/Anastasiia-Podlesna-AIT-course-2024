package pets.model;

public abstract class Pet
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

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return String.format("id: %d, type: %s, age: %d, name: %s", id, type, age, name);
    }

}


