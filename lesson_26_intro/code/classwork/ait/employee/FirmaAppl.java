package classwork.ait.employee;

import classwork.ait.employee.dao.CompanyImpl;
import classwork.ait.employee.model.Employee;
import classwork.ait.employee.model.Manager;
import classwork.ait.employee.model.SalesManager;
import classwork.ait.employee.model.Worker;

public class FirmaAppl
{
    private static CompanyImpl company;
    private static Employee[] emp;

    public static void main(String[] args)
    {
        company = new CompanyImpl(5);
        // заполняем массив, что бы заполнить объект
        emp = new Employee[4];
        emp[0] = new Manager(1, "N1", "L1", 150, 5000, 25);
        emp[1] = new SalesManager(2, "N2", "L2", 160, 50000, 0.1);
        emp[2] = new SalesManager(3, "N3", "L3", 160, 80000, 0.15);
        emp[3] = new Worker(4, "N4", "L4", 140, 20);

        // TODO поместить объекты emp[] в объект company с помощью метода addEmployee
        for (int i = 0; i < 4; i++)
        {
            company.addEmployee(emp[i]);
        }

        Employee[] res;
        res = company.findEmployeeSalaryRange(1000, 6000);

        for (int i = 0; i < res.length; i++)
        {
            System.out.println(res[i]);
        }

    }

}
