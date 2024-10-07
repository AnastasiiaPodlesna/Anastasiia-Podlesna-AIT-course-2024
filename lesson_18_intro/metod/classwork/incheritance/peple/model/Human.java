package classwork.incheritance.peple.model;

public class Human
{
    boolean gender; // defaulf modifier - not presence
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;

    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor)
    {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString()
    {
        return "Human{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }



}
