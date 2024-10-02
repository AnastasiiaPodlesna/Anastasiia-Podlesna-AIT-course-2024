package homework.students.model;

public class Students
{
    private int id;
    private String name;
    private String surname;
    private int birth_year;
    private String specialization;

    public Students(int id, String name, String surname, int birth_year, String specialization)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birth_year = birth_year;
        this.specialization = specialization;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year)
    {
        this.birth_year = birth_year;
    }

    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    public String display()
    {
        return String.format("ID: %d, name: %s, surname: %s, birth_year: %d, specialization: %s", id, name, surname, birth_year, specialization);
    }
    //----------------------------------------------------------

    public void study()
    {
        System.out.println("Student wants to study!");
    }
    public void vacation()
    {
        System.out.println("Student wants to take a vacation!");
    }
    public void exam()
    {
        System.out.println("Student wants to take an exam!");
    }
    public void marriage()
    {
        System.out.println("Student wants to get married!");
    }





}
