package classwork.ait.employee.dao;

import classwork.ait.employee.model.Employee;

public class CompanyImpl implements Company
{
    private Employee[] employees;
    private int size;

    public CompanyImpl (int capacity)  // capacity - максимально возможное количество сотрудников в компании
    {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee)
    {
        if (employee == null || size >= employees.length || findEmployee(employee.getId()) != null)
        {
            return false;
        }

        return false;
        employees[size] = employee;
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id)
    {
        for (int i = 0; i < size; i++)
        {
            if(employees[i].getId() == id)
            {
                Employee victim = employees[i];
                employees[i] = employees[size-1];
                employees[size-1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }



    @Override
    public Employee findEmployee(int id)
    {
        for (int i = 0; i < size; i++)
        {
            if(employees[i].getId() == id)
            {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee)
    {
        return null;
    }

    @Override
    public int quantity()
    {
        return size;
    }

    @Override
    public void printEmployee()
    {

    }

    @Override
    public double totalSalary()
    {
        return 0;
    }

    @Override
    public double totalSales()
    {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreatThan(int hours)
    {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min,
            double max)
    {
        return new Employee[0];
    }
}
