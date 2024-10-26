package pets.model;

public class Cat extends Pet
{
    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String type, int age, String name, String breed, double height, double weight)
    {
        super(id, type, age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }


    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return String.format("id: %d, type: %s, age: %d, name: %s, breed: %s, height: %.2f, weight: %.2f", getId(), getType(), getAge(), getName(), breed, height, weight);

    }
    
}


