package classwork.ait.employee.test;

import classwork.ait.employee.dao.Company;
import classwork.ait.employee.dao.CompanyImpl;
import classwork.ait.employee.model.Employee;
import classwork.ait.employee.model.Manager;
import classwork.ait.employee.model.SalesManager;
import classwork.ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest
{
    Company company;
    Employee[] emp;


    @BeforeEach
    void setUp()
    {
        // создаем объект
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

    }

    @Test
    void addEmployeeTest()
    {
        assertEquals(4, company.quantity());

        assertFalse(company.addEmployee(null));

        assertFalse(company.addEmployee(emp[2]));

        Employee newEmp = new Worker(5, "N5", "L5", 160, 20);
        assertTrue(company.addEmployee(newEmp));
        assertEquals(5, company.quantity());

        Employee oneMoreEmp = new Worker(6, "N6", "L6", 160, 20);
        assertFalse(company.addEmployee(oneMoreEmp));

        for (int i = 0; i < 4; i++)
        {
            company.addEmployee(emp[i]);
        }
    }

    @Test
    void removeEmployeeTest()
    {
        // can remove existed
        assertEquals(emp[2], company.removeEmployee(3));
        // check size
        assertEquals(3, company.quantity());
        // can't remove absent
        assertNull(company.removeEmployee(8));

    }

    @Test
    void findEmployeeTest()
    {
        assertEquals(emp[1], company.findEmployee(2));
        assertNull(company.findEmployee(7));
    }

    @Test
    void updateEmployeeTest()
    {
    }

    @Test
    void quantityTest()
    {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployeeTest()
    {
        for (int i = 0; i < 4; i++)
        {
            System.out.println(emp[i]);
        }
    }

    @Test
    void totalSalaryTest()
    {
        double totalSalary = 28550; // предположение
        assertEquals(totalSalary, company.totalSalary());
    }

    @Test
    void totalSalesTest()
    {
        assertEquals(130000, company.totalSales());
    }

    @Test
    void averageSalaryTest()
    {
        assertEquals(7137.5, company.averageSalary());
    }

    @Test
    void findEmployeeHoursGreatThanTest()
    {
        Employee[] employeeHoursGreatThan = {emp[1], emp[2]};
        assertArrayEquals(employeeHoursGreatThan, company.findEmployeeHoursGreatThan(150));
    }

    @Test
    void findEmployeeSalaryRangeTest()
    {
        double min = 2000;
        double max = 6000;
        Employee[] employeeSalaryRange = {emp[1], emp[3]};
        assertArrayEquals(employeeSalaryRange, company.findEmployeeSalaryRange(min, max));
    }
}