package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

import java.util.function.Predicate;

public class CompanyImpl implements Company
{
    public Employee[] employees;
    private int size;
    private CompanyImpl company;

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
//                employees[i] = employees[size-1];
//                employees[size-1] = null;
//                size--;
                System.arraycopy(employees, i+1, employees, i, size - i - 1);
                employees[--size] = null;
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
    public Boolean updateEmployee(Employee employee)
    {

        for (int i = 0; i < size; i++)
        {
            if (employees[i].getId() == employee.getId())
            {
                employees[i] = employee; // обновляем
                return true; // получилось обновить
            }
        }
        return false; // не удалось обновить
    }

    @Override
    public int quantity()
    {
        return size;
    }

    @Override
    public void printEmployee()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary()
    {
        double totalSal = 0;
        for (int i = 0; i < size; i++)
        {
            totalSal += employees[i].calsSalary();
        }

        return totalSal;
    }

    @Override
    public double averageSalary()
    {
        return totalSalary() / size;
    }

    @Override
    public double totalSales()
    {
        double totalSales = 0;
        for (int i = 0; i < size; i++)
        {
            if(employees[i] instanceof SalesManager) // проверка перед кастингом
            {
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeeHoursGreatThan(int hours)
    {
       return findCarsByPredicate(employee -> employee.getHours() > hours) ;
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min,
            double max)
    {
        return findCarsByPredicate(employee -> employee.calsSalary() > min && employee.calsSalary() < max);
    }

    private Employee[] findCarsByPredicate(Predicate<Employee> predicate)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (predicate.test(employees[i]))
            { // объект проходит тест
                count++;
            }
        }
        // читаем массив и перекладываем рез-ты в новый
        Employee[] res = new Employee[count];
        for (int i = 0, j = 0 ; j < res.length; i++)
        {
            if(predicate.test(employees[i]))
            {
                res[j++] = employees[i];
            }
        }
        return res;
    }

}
