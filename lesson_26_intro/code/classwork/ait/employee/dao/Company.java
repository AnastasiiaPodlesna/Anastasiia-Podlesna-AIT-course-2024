package classwork.ait.employee.dao;

// - добавление сотрудника
// - нахождение сотрудника по id
// - обновление cотрудника
// - удаление сотрудника
// - печать списка сотрудников
// - кол-во сотрудников
// - объем ФОТ
// - объем продаж

import classwork.ait.employee.model.Employee;

public interface Company
{
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    Employee updateEmployee (Employee employee);

    int quantity();

    void printEmployee();

    double totalSalary(); // объем ФОТ

    double averageSalary();

    double totalSales();  // объем продаж, есть только у менеджера

    Employee[] findEmployeeHoursGreatThan (double hours);  // переработка, массив сотрудников

    Employee[] findEmployeeSalaryRange(double min, double max); // список сотрудников по зарплате в диапазоне



}
