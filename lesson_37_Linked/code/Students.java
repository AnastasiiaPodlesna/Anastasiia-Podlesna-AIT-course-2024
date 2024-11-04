import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Students
{
    public static void main(String[] args)
    {

        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Ivanov", "Petrov", "Vasechkin", "Sidorov", "Smirnov", "Kuznetsov", "Popov", "Alekseev", "Fedorov", "Nikolaev", "Romanov"));

        Collections.shuffle(students); // перемешали студентов

        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        int halfSize = students.size() / 2;

        for (int i = 0; i < students.size(); i++)
        {
            if (i < halfSize)
            {
                group1.add(students.get(i)); // добавляем студентов в 1 группу
            } else
            {
                group2.add(students.get(i)); // добавляем студентов во 2 группу
            }
        }

        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);
    }
}
