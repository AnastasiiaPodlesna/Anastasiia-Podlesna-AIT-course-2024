package homework;

//Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
// если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class CalcThePaymentOfMoney
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input length of service:  ");
        double  lengthOfService  = in.nextDouble();     // стаж работы

        double basic_Salary = 500;                      // базовая з/п
        double current_Salary;                          // текущая з/п
        double bonus;                                   // бонус


        if (lengthOfService > 0 && lengthOfService < 3)
        {
            bonus = 0;
            current_Salary = currentSalary (basic_Salary, bonus);
            System.out.println("Your salary is $" + current_Salary);
        }
        else if (lengthOfService >= 3 && lengthOfService < 5)
        {
            bonus = 0.1;
            current_Salary = currentSalary (basic_Salary, bonus);
            System.out.println("Your salary is  $" + current_Salary);
        }
        else if (lengthOfService >= 5 && lengthOfService < 10)
        {
            bonus = 0.5;
            current_Salary = currentSalary (basic_Salary, bonus);
            System.out.println("Your salary is  $" + current_Salary);
        }
        else if (lengthOfService >= 10 && lengthOfService < 15)
        {
            bonus = 1;
            current_Salary = currentSalary (basic_Salary, bonus);
            System.out.println("Your salary is  $" + current_Salary);
        }
        else if (lengthOfService >= 15)
        {
            bonus = 1.5;
            current_Salary = currentSalary (basic_Salary, bonus);
            System.out.println("Your salary is  $" + current_Salary);
        }
    }

    public static double currentSalary(double basic_Salary, double bonus)
    {
        return basic_Salary + basic_Salary * bonus;
    }
}
