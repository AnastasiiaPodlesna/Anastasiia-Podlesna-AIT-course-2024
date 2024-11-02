package protocolOfResultsOfRace.model;

public class Athlete
{
    private String lastName;
    private String firstName;
    private int registrationNumber;
    private  String club;
    private double result;

    public Athlete(String lastName,
            String firstName,
            int registrationNumber,
            String club,
            double result)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registrationNumber = registrationNumber;
        this.club = club;
        this.result = result;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getClub()
    {
        return club;
    }

    public double getResult()
    {
        return result;
    }

    public void setRegistrationNumber(int registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    public void setClub(String club)
    {
        this.club = club;
    }

    public void setResult(double result)
    {
        this.result = result;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("protocolOfResultsOfRace.model.ProtokolOfResult{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", registrationNumber=").append(registrationNumber);
        sb.append(", club='").append(club).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
