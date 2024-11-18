package toDoList;

import toDoList.dao.ToDoListImpl;
import toDoList.model.Task;
import toDoList.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoAppl implements Serializable {
    public static void main(String[] args)
    {
        // greeting
        System.out.println("Welcome to ToDo Application!");

        ToDoListImpl toDoList = new ToDoListImpl(); // объект
        LocalDate now = LocalDate.now();

        // начало цикла
        while (true) {
            // print menu
            System.out.println("\n\u001B[31m======== MENU =========\u001B[0m");
            System.out.println("------------------------------------------------");
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);
                    toDoList.addTask(t);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    List<Task> taskList = toDoList.getAllTasks();
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("task_list.txt", true))) {

                        oos.writeObject(taskList);

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 5:{
                    System.out.println("Loading... ");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("task_list.txt"))) {

                        List<Task> readTask =  (List<Task>) ois.readObject();
                        System.out.println("List of tasks: ");
                        int taskNumber = 0;
                        for (Task t : readTask)
                        {
                            System.out.println((taskNumber++ + 1) + ". " + t.getTask() + ", data: " + t.getDate());
                             toDoList.addTask(t);
                        }

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}
