package homework.students;

import java.util.Map;

public class Student
{
    private String name;
    public Map<String, Integer> subjectsAndGrades;

    public Student(String name,
            Map<String, Integer> subjectsAndGrades)
    {
        this.name = name;
        this.subjectsAndGrades = subjectsAndGrades;
    }

    public String getName()
    {
        return name;
    }

    public Map<String, Integer> getSubjectsAndGrades()
    {
        return subjectsAndGrades;
    }

    @Override
    public String toString()
    {
        return name + " " + subjectsAndGrades;
    }

    //  вычислениe среднего балла
    public double getAverageGrade()
    {
        return subjectsAndGrades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
