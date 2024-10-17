package classwork.ait.employee.model;

public class Manager extends Employee
{
    private double baseSalary;
    private int grade; // почасовой оклад

    public Manager(int id,
            String name,
            String secondName,
            double hours,
            double baseSalary,
            int grade)
    {
        super(id, name, secondName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    @Override
    public double calsSalary()
    {
        double salary = baseSalary + hours * grade;
        return ensureSalary(salary);  // проверка минимальной зарплаты
    }


}
