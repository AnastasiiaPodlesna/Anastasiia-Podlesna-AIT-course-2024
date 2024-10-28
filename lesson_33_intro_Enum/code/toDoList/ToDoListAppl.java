package toDoList;

import java.util.Scanner;

public class ToDoListAppl
{
    private static final int INITIAL_TASK_CAPACITY = 5;
    private static int taskCount = 0; // количество задач
    private static String[] tasks = new String[INITIAL_TASK_CAPACITY];

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
            System.arraycopy(tasks, taskNumber, tasks, taskNumber - 1, taskCount - taskNumber);
            tasks[--taskCount] = null; // уменьшаем счетчик и ставим null на последнее место
            System.out.println("Task deleted");
        } else
        {
            System.out.println("Wrong task number");
        }
    }

    private static void expandTaskArray()
    {
        String[] newTask = new String[tasks.length + INITIAL_TASK_CAPACITY]; // увеличиваем размер
        System.arraycopy(tasks, 0, newTask, 0, tasks.length);
        tasks = newTask;
    }
}