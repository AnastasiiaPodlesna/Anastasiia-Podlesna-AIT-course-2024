package toDoList.dao;

import toDoList.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToDoListImpl implements ToDoList {

    private  List<Task> tasks; // хранилище
    private int quantity;
    private LocalDate time;

    public ToDoListImpl()
    {
        this.tasks = new ArrayList<>(); // резиновый список
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task)
    {
        if (task == null || tasks.contains(task))
        {
            return false;
        }
        tasks.add(task);
        quantity = tasks.size();
        return true;
    }

    @Override
    public Task removeTask(int taskNumber)
    {
        if (taskNumber >= 1 && taskNumber <= quantity)
        {
            Task victim = tasks.get(taskNumber - 1);
            tasks.remove(victim);
            System.out.println("Task: " + victim.getTask() + " is removed.");
            quantity--;
            return victim;
        }
        System.out.println("Wrong number of task.");
        return null;
    }

    @Override
    public void viewTasks()
    {
//        for (Task t : tasks)
//        {
//            System.out.println(t);
//        }

        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));

    }

    @Override
    public List<Task> getAllTasks()
    {
        return tasks.stream().toList();
    }

    @Override
    public int quantity()
    {
        return quantity;
    }
}