package home_work_CurExchange_Students;

// Напишите программу, которая: Создает список студентов, зарегистрированных
// на два разных курса: "Математика" и "Информатика".
// Выводит: Список студентов, которые записаны на оба курса.
// Список студентов, которые записаны только на один из курсов.
// Условия: Используйте два HashSet для хранения студентов каждого курса.
// Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StudentsOfCoursesAppl
{
    public static void main(String[] args)
    {
       HashSet<String> mathematics = new HashSet<>();
       HashSet<String> computerScience = new HashSet<>();

       // студенты курса математики
        System.out.println("Students in the math course: ");
        mathematics.addAll(Arrays.asList("Ivanov", "Petrov", "Vasechkin", "Sidorov", "Popov", "Alekseev", "Nikolaev"));
        printList(mathematics);

       // студенты курса информатики
        System.out.println("Students of computer science course: ");
        computerScience.addAll(Arrays.asList("Sidorov", "Smirnov", "Kuznetsov", "Popov", "Alekseev", "Fedorov", "Romanov"));
        printList(computerScience);

        // метод пересечения множеств (студентов на курсах)
        System.out.println("Students of both courses: ");
        printList(studentsIntersection(mathematics, computerScience));

        // метод разности множеств (студентов на курсах)
        System.out.println("Students who are only taking one of the courses: ");

        System.out.println("\nStudents of math course only: ");
        // первый вариант - если не находим эл-ты одного множества в другом
        printList(differenceOfSetsOfStudents1(mathematics, computerScience));

        System.out.println("Students of computer science course only: ");
        // второй вариант - удаляем из одного множества пересечение двух множеств, метод в методе
        printList(differenceOfSetsOfStudents2(computerScience, studentsIntersection(mathematics, computerScience)));


    }

    private static HashSet<String> differenceOfSetsOfStudents2(HashSet<String> course, HashSet<String> studentsIntersection)
    {
        course.removeAll(studentsIntersection);
        return course;
    }

    private static HashSet<String> differenceOfSetsOfStudents1(HashSet<String> course1, HashSet<String> course2)
    {
        HashSet<String> setDifference = new HashSet<>();

        for (String student : course1)
        {
            if (!course2.contains(student))
            {
                setDifference.add(student);
            }
        }
        return setDifference;
    }

    private static HashSet<String> studentsIntersection (HashSet<String>course1, HashSet<String> course2)
    {
        HashSet<String> intersection = new HashSet<>();

        for (String course: course1)            //retainAll
            if (course2.contains(course))
            {
                intersection.add(course);
            }
        return intersection;
    }

    private static void printList(Set<String> group)
    {
        for (String student: group)
        {
            System.out.print(student + " ");
        }
        System.out.println("\n------------------------------------------------------------------------");
    }
}
