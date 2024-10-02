package classwork.employee.model;

//  - создадим класс Employee (работник):
//  - поля
//  - конструктор
//  - геттеры и сеттеры
//  - метод display
//  - создадим класс FirmaAppl, в котором:
//  - создаем объекты типа Employee
//  - определим зарплату и вычислим ее общую сумму.

public class Employee
{
    // создали поля класса

    private int id;
    private String name;
    private String lastName;
    private double salary;
    private boolean gender;

    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }

    // сеттеры - те значения, которые будем менять (выбрали 2 поля)

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // геттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public String display()
    {
        return String.format("ID: %d, name: %s, lastname: %s, salary: %.2f, gender: %s", id, name, lastName, salary, gender);
    }



}
