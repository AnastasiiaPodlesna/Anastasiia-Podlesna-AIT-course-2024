package homework.students;

import homework.students.model.Students;

public class StudentAppl
{
    public static void main(String[] args)
    {
        Students[] students = new Students[3]; // создали массив для хранения объектов
        students[0] = new Students(111, "Vasily", "Karlov", 2006, "Applied mathematics");
        students[1] = new Students(222, "Olga", "Marchenko", 2008, "International journalism");
        students[2] = new Students(333, "Vasily", "Karlov", 2006, "Industrial psychology");


        System.out.println("\nStudent 1: " + students[0].display());
        students[0].study();
        students[0].exam();
        students[0].vacation();
        System.out.println("\nStudent 2: " + students[1].display());
        students[1].study();
        students[1].exam();
        System.out.println("\nStudent 3: " + students[2].display());
        students[2].marriage();











    }
}
