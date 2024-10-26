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
        final StringBuilder sb = new StringBuilder("pets.model.Cat{");
        sb.append("breed='").append(breed).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
    
}

