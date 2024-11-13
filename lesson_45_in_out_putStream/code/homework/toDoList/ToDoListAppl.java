package homework.toDoList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl
{
    private static final int INITIAL_TASK_CAPACITY = 5;
    private static int taskCount = 0; // количество задач
    private static String[] tasks = new String[INITIAL_TASK_CAPACITY];
    private static String fileName = "data.txt";


    public ToDoListAppl() throws FileNotFoundException
    {
        System.out.println("File not found");
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            ToDoList.printMenu();
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            ToDoList option = ToDoList.findByNumber(choice);// поиск задачи по указ. номеру
            if (option != null)
            {
                switch (option)
                {
                    case TD1 ->
                    {
                        System.out.println("You've selected <" + ToDoList.TD1.getAction() + ">");
                        System.out.print("Input task => ");
                        addTask(scanner.nextLine());
                    }
                    case TD2 ->
                    {
                        System.out.println("You've selected <" + ToDoList.TD2.getAction() + ">");
                        viewTasks();
                    }
                    case TD3 ->
                    {
                        System.out.println("You've selected <" + ToDoList.TD3.getAction() + ">");
                        System.out.print("Input the task number to be deleted  => ");
                        deleteTask(scanner.nextInt());
                    }
                    case TD4 ->
                    {
                        System.out.println("Exit");
                        scanner.close();

                        // очищаем файл
                        try (FileOutputStream file = new FileOutputStream(fileName))
                        {
                            // очистка файла: не записываем ничего, просто открываем файл на запись и автоматически обнуляет файл
                        } catch (IOException e)
                        {
                            System.out.println("Error while clearing the file: " + e.getMessage());
                        }
                        return; // выход из метода main
                    }
                }
            } else
            {
                System.out.println("Wrong choice. Try again.");
            }
        }
    }

    public static void addTask(String task)
    {
        if (taskCount == tasks.length)
        {
            expandTaskArray();
        }
        tasks[taskCount] = task;
        taskCount++;


        // Записываем строку в файл
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true)) // используем с параметром true, который открывает файл в режиме добавления.
        {
            fileOutputStream.write(task.getBytes());// записываем строку в байтах
            fileOutputStream.write(System.lineSeparator().getBytes());  // добавляем новую строку
            System.out.println("Line added to file successfully.");
        } catch (IOException e) {
            System.out.println("Error adding line to file: " + e.getMessage());
        }
    }

    private static void viewTasks()
    {
        if (taskCount == 0)
        {
            System.out.println("No tasks...");
        } else
        {
            System.out.println("Tasks list: ");
            for (int i = 0; i < taskCount; i++)
            {
                System.out.println((i + 1) + " : " + tasks[i]);
            }
        }
    }

    public static void deleteTask(int taskNumber)
    {
        if (taskCount == 0)
        {
            System.out.println("No tasks...");
            return;
        }

        if (taskNumber > 0 && taskNumber <= taskCount)
        {
            try
            {
                // Читаем все строки из файла в список
                List<String> lines = Files.readAllLines(Paths.get(fileName));
                lines.removeIf(line -> line.equals(tasks[taskNumber-1]));  // Удаляем строку

                // Перезаписываем файл с новыми данными
                Files.write(Paths.get(fileName), lines);
                System.out.println("Line removed from file successfully.");
            }
            catch (IOException e)
            {
                System.out.println("Error removing line from file: " + e.getMessage());
            }

            System.arraycopy(tasks, taskNumber, tasks, taskNumber - 1, taskCount - taskNumber);
            tasks[--taskCount] = null; // уменьшаем счетчик и ставим null на последнее место
            System.out.println("Task deleted");
        } else
        {
            System.out.println("Wrong task number");
        }
    }

    private static void expandTaskArray() // меняем размер
    {
        String[] newTask = new String[tasks.length + INITIAL_TASK_CAPACITY]; // увеличиваем размер
        System.arraycopy(tasks, 0, newTask, 0, tasks.length);
        tasks = newTask;
    }
}