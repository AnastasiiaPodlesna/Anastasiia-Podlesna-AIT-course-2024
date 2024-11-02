package planets.model;

import java.util.Objects;

public class Planet
{
    private String name;
    private double distanceToTheSun;
    private double mass;
    private int numberOfSatellites;

    public Planet(String name,
            double distanceToTheSun,
            double mass,
            int numberOfSatellites)
    {
        this.name = name;
        this.distanceToTheSun = distanceToTheSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getDistanceToTheSun()
    {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun)
    {
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMass()
    {
        return mass;
    }

    public void setMass(double mass)
    {
        this.mass = mass;
    }

    public int getNumberOfSatellites()
    {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites)
    {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return Double.compare(distanceToTheSun, planet.distanceToTheSun) == 0 && Double.compare(mass, planet.mass) == 0 && numberOfSatellites == planet.numberOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, distanceToTheSun, mass, numberOfSatellites);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("planets.model.Planet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distanceToTheSun=").append(distanceToTheSun);
        sb.append(", mass=").append(mass);
        sb.append(", numberOfSatellites=").append(numberOfSatellites);
        sb.append('}');
        return sb.toString();
    }
}
