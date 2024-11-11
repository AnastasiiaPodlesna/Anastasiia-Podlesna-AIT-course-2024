package homework.students;

// Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()

import java.util.*;

public class GradesOfStudents
{
    // 20 имен студентов
    public static  String[] names = {"Andreev A.A.", "Vasechkin V.V.", "Alekseev L.L.", "Bubnov B.B.", "Golovach G.G.", "Smirnov S.S.", "Petrov P.P.", "Buynov B.B.", "Krylov K.K.", "Pchelkin P.P.", "Orlov O.O.", "Gubanov G.G.", "Sidorov S.S.", "Molchun M.M.", "Vorchun V.V.", "Umnik U.U.", "Veselchak V.V.", "Skromnik S.S.", "Chichun C.C.", "Prostyak P.P."};
    //10 предметов
    public static  String[] subjects = {"Math", "Science", "English", "History", "Geography", "Physics", "Chemistry", "Biology", "Art", "Music"};

    public static void main(String[] args)
    {
        List<Student> students = generateStudents(20);

        // студенты и их средний балл по всем предметам
        students.forEach(student ->
                System.out.println(student + " => average score: " + student.getAverageGrade()));


        // находим максимальный и минимальный средний балл
        Student maxAverage = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))
                .orElse(null);
        Student minAverage = students.stream()
                .min(Comparator.comparing(Student::getAverageGrade))
                .orElse(null);

        System.out.println("----------------------------------------------------------");
        System.out.println("Student " + maxAverage.getName() + " has a maximum grade point average => " + maxAverage.getAverageGrade());
        System.out.println("Student " + minAverage.getName() + " has a minimum grade point average => " + minAverage.getAverageGrade());
    }

    // Генерация студентов
    private static List<Student> generateStudents(int numStudents)
    {
        List<Student> students = new ArrayList<>(); // список объектов - студентов

        Random random = new Random();

        for (String name : names)
        {
            Map<String, Integer> subjectsAndAssessments = new HashMap<>(); // ключ - имя, значение - предметы и оценки

            for (String subject : subjects)
            {
                subjectsAndAssessments.put(subject, random.nextInt(5) + 1); // предмет и оценка от 1 до 5
            }
            students.add(new Student(name, subjectsAndAssessments));
        }
        return students;
    }

}
